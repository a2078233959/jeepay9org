package org.jeepay.pay.ctrl.account;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.jeepay.core.common.constant.MchConstant;
import org.jeepay.core.common.constant.PayConstant;
import org.jeepay.core.common.constant.PayEnum;
import org.jeepay.core.common.util.MyLog;
import org.jeepay.core.common.util.JEEPayUtil;
import org.jeepay.core.entity.MchApp;
import org.jeepay.core.entity.MchInfo;
import org.jeepay.core.entity.UserAccount;
import org.jeepay.pay.service.RpcCommonService;

/**
 * @Description: 充值接口(给用户账户加钱操作)
 * @author aragom qq194088539
 * @date 2018-03-27
 * @version V1.0
 * @Copyright: www.jeepay.org
 */
@RestController
public class RechargeController {

    private final MyLog _log = MyLog.getLog(RechargeController.class);

    @Autowired
    private RpcCommonService rpcCommonService;

    /**
     * 充值
     * @param params
     * @return
     */
    @RequestMapping(value = "/api/account/recharge")
    public String recharge(@RequestParam String params) {
        _log.info("###### 开始接收账户充值请求 ######");
        String logPrefix = "【账户充值】";
        _log.info("{}请求参数:{}", logPrefix, params);
        try {
            JSONObject po = JSONObject.parseObject(params);
            JSONObject payContext = new JSONObject();
            JSONObject obj = null;
            // 验证参数有效性
            Object object = validateParams(po, payContext);
            if (object instanceof String) {
                _log.info("{}参数校验不通过:{}", logPrefix, object);
                return JEEPayUtil.makeRetFail(JEEPayUtil.makeRetMap(PayConstant.RETURN_VALUE_FAIL, object.toString(), null, PayEnum.ERR_0014.getCode(), object.toString()));
            }

            if (object instanceof JSONObject) obj = (JSONObject) object;
            if(obj == null) return JEEPayUtil.makeRetFail(JEEPayUtil.makeRetMap(PayConstant.RETURN_VALUE_FAIL, "账户充值失败", null, PayEnum.ERR_0010.getCode(), "账户充值失败"));
            Long mchId = obj.getLong("mchId");
            String userId = obj.getString("userId");
            Long amount = obj.getLong("amount");

            int result = rpcCommonService.rpcUserAccountService.userAccountRollIn(mchId, userId, amount);
            _log.info("{}userId={},mchId={},amount={},结果:{}", logPrefix, userId, mchId, amount, result);
            if(result != 1) {
                return JEEPayUtil.makeRetFail(JEEPayUtil.makeRetMap(PayConstant.RETURN_VALUE_FAIL, "账户充值失败", null, PayEnum.ERR_0010.getCode(), "DB操作失败"));
            }

            UserAccount userAccount = rpcCommonService.rpcUserAccountService.getUserAccount(mchId, userId);
            if(userAccount == null) {
                return JEEPayUtil.makeRetFail(JEEPayUtil.makeRetMap(PayConstant.RETURN_VALUE_FAIL, "查询账户返回为空", null, PayEnum.ERR_0010.getCode(), "查询账户返回为空"));
            }
            // 构建返回对象
            JSONObject accObj = new JSONObject();
            accObj.put(PayConstant.RETURN_PARAM_RETCODE, PayConstant.RETURN_VALUE_SUCCESS);
            accObj.put("userId", userAccount.getUserId());
            accObj.put("mchId", userAccount.getMchId());
            accObj.put("balance", userAccount.getBalance());                // 账户余额
            accObj.put("useableBalance", userAccount.getUseableBalance());  // 可用余额
            accObj.put("state", userAccount.getState());                    // 账户状态.0表示账户冻结.1表示正常
            accObj.put("totalRollIn", userAccount.getTotalRollIn());        // 累计收入
            accObj.put("totalRollOut", userAccount.getTotalRollOut());      // 累计支出
            accObj.put("accountOpenTime", userAccount.getCreateTime().getTime());     // 账户开户时间

            return JEEPayUtil.makeRetData(accObj, payContext.getString("key"));

        }catch (Exception e) {
            _log.error(e, "");
            return JEEPayUtil.makeRetFail(JEEPayUtil.makeRetMap(PayConstant.RETURN_VALUE_FAIL, "支付中心系统异常", null, PayEnum.ERR_0010.getCode(), "请联系技术人员查看"));
        }
    }

    /**
     * 验证创建订单请求参数,参数通过返回JSONObject对象,否则返回错误文本信息
     * @param params
     * @return
     */
    private Object validateParams(JSONObject params, JSONObject payContext) {
        // 验证请求参数,参数有问题返回错误提示
        String errorMessage;
        // 支付参数
        String mchId = params.getString("mchId"); 			    // 商户ID
        String userId = params.getString("userId");             // 用户ID
        String amount = params.getString("amount"); 		    // 充值金额（单位分）
        String sign = params.getString("sign"); 				// 签名

        // 验证请求参数有效性（必选项）
        Long mchIdL;
        if(StringUtils.isBlank(mchId) || !NumberUtils.isDigits(mchId)) {
            errorMessage = "request params[mchId] error.";
            return errorMessage;
        }
        mchIdL = Long.parseLong(mchId);
        if(StringUtils.isBlank(userId)) {
            errorMessage = "request params[userId] error.";
            return errorMessage;
        }
        if(!NumberUtils.isDigits(amount)) {
            errorMessage = "request params[amount] error.";
            return errorMessage;
        }

        // 签名信息
        if (StringUtils.isBlank(sign)) {
            errorMessage = "request params[sign] error.";
            return errorMessage;
        }

        // 查询商户信息
        MchInfo mchInfo = rpcCommonService.rpcMchInfoService.findByMchId(mchIdL);
        if(mchInfo == null) {
            errorMessage = "Can't found mchInfo[mchId="+mchId+"] record in db.";
            return errorMessage;
        }
        if(mchInfo.getStatus() != MchConstant.PUB_YES) {
            errorMessage = "mchInfo not available [mchId="+mchId+"] record in db.";
            return errorMessage;
        }

        String key = mchInfo.getPrivateKey();
        if (StringUtils.isBlank(key)) {
            errorMessage = "key is null[mchId="+mchId+"] record in db.";
            return errorMessage;
        }
        payContext.put("key", key);

        // 验证签名数据
        boolean verifyFlag = JEEPayUtil.verifyPaySign(params, key);
        if(!verifyFlag) {
            errorMessage = "Verify XX pay sign failed.";
            return errorMessage;
        }
        // 验证参数通过,返回JSONObject对象
        JSONObject object = new JSONObject();
        object.put("mchId", mchIdL);
        object.put("userId", userId);
        object.put("amount", amount);

        return object;
    }

}
