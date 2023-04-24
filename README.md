# jeepay9org
捷派支付系统商业版本，使用 springboot + dubbo 架构开发,支持分布式部署.

### 开发说明

jeepay-generator 生成mybatis代码,然后将model拷贝到jeepay-core项目中,将mapper拷贝到jeepay-service项目中,拷贝mapper时要比对是否有修改

jeepay-service 为dubbo服务生产者,所有与数据库操作,或公共的的业务逻辑都封装此业务层

jeepay-core 为公共方法,dubbo服务接口以及实体bean,每个项目都需要引用

jeepay-manage 运营管理平台的接口

jeepay-merchant 商户系统的接口

jeepay-agent 代理商系统的接口

jeepay-pay 支付核心,所有支付渠道对接实现

jeepay-task 定时任务,包括对账服务,结算服务.部署时需单节点部署

#### jeepay9org
| 项目  | 端口 | 描述
|---|---|---
|jeepay-core |  | 公共方法,实体Bean,API接口定义
|jeepay-generator |  | mybatis数据访问层生成代码
|jeepay-manage | 58193 | 运营平台接口
|jeepay-merchant | 58191 | 商户系统接口
|jeepay-agent | 58192 | 代理商系统接口
|jeepay-pay | 53020 | 支付核心系统
|jeepay-service |  | 业务接口
|jeepay-task | 58194 | 定时任务,包括对账和结算服务

演示图:

https://github.com/a2078233959/jeepay9org/blob/main/1.png

https://github.com/a2078233959/jeepay9org/blob/main/2.png

https://github.com/a2078233959/jeepay9org/blob/main/3.png


--系统演示-----------------

（1）运营平台
网址：http://39.109.123.202:58193
账号：admin
密码：admin888

（2）代理商系统
网址：http://39.109.123.202:58192
账号：testagent
密码：abc998998

（3）商户系统
网址：http://39.109.123.202:58191
账号：testuser
密码：abc998998
