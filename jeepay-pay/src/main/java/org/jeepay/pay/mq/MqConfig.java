package org.jeepay.pay.mq;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

/**
 * @Description:
 * @author aragom qq194088539
 * @date 2017-07-05
 * @version V1.0
 * @Copyright: www.jeepay.org
 */
@Configuration
public class MqConfig {

    public static final String PAY_NOTIFY_QUEUE_NAME = "pay.notify.queue";

    public static final String MCH_NOTIFY_QUEUE_NAME = "queue.notify.mch";

    public static final String MCH_PAY_NOTIFY_QUEUE_NAME = "queue.notify.mch.pay";

    public static final String MCH_TRANS_NOTIFY_QUEUE_NAME = "queue.notify.mch.trans";

    public static final String MCH_REFUND_NOTIFY_QUEUE_NAME = "queue.notify.mch.refund";

    public static final String MCH_AGENTPAY_NOTIFY_QUEUE_NAME = "queue.notify.mch.agentpay";

    public static final String TRANS_NOTIFY_QUEUE_NAME = "queue.notify.trans";

    public static final String REFUND_NOTIFY_QUEUE_NAME = "queue.notify.refund";

    public static final String PAY_QUERY_QUEUE_NAME = "queue.pay.query";

    public static final String TRANS_QUERY_QUEUE_NAME = "queue.trans.query";

    public static final String CASH_COLL_QUEUE_NAME = "queue.cash.coll";

    @Bean
    public Queue payNotifyQueue() {
        return new ActiveMQQueue(PAY_NOTIFY_QUEUE_NAME);
    }

    @Bean
    public Queue mchNotifyQueue() {
        return new ActiveMQQueue(MCH_NOTIFY_QUEUE_NAME);
    }

    @Bean
    public Queue transNotifyQueue() {
        return new ActiveMQQueue(TRANS_NOTIFY_QUEUE_NAME);
    }

    @Bean
    public Queue refundNotifyQueue() {
        return new ActiveMQQueue(REFUND_NOTIFY_QUEUE_NAME);
    }

    @Bean
    public Queue mchPayNotifyQueue() {
        return new ActiveMQQueue(MCH_PAY_NOTIFY_QUEUE_NAME);
    }

    @Bean
    public Queue mchTransNotifyQueue() {
        return new ActiveMQQueue(MCH_TRANS_NOTIFY_QUEUE_NAME);
    }

    @Bean
    public Queue mchRefundNotifyQueue() {
        return new ActiveMQQueue(MCH_REFUND_NOTIFY_QUEUE_NAME);
    }

    @Bean
    public Queue payQueryQueue() {
        return new ActiveMQQueue(PAY_QUERY_QUEUE_NAME);
    }

    @Bean
    public Queue transQueryQueue() {
        return new ActiveMQQueue(TRANS_QUERY_QUEUE_NAME);
    }

    @Bean
    public Queue mchAgentpayNotifyQueue() {
        return new ActiveMQQueue(MCH_AGENTPAY_NOTIFY_QUEUE_NAME);
    }

    @Bean
    public Queue cashCollQueue() {
        return new ActiveMQQueue(CASH_COLL_QUEUE_NAME);
    }
}
