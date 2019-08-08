package com.joker.receiver;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(bindings = @QueueBinding(
        value = @Queue(value = "${mq.config.queue.logs}",autoDelete = "true"),
        exchange = @Exchange(value = "${mp.config.exchange}",type = ExchangeTypes.TOPIC),
        key = "*.log.*"
))
public class AllReceiver {

    @RabbitHandler
    public void process(String msg){
        System.out.println("all....receiver:"+msg);
    }
}
