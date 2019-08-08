package com.joker.receiver;


import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(bindings = @QueueBinding(
        value = @Queue(value = "${mq.config.queue.red}",autoDelete = "true")
        ,exchange = @Exchange(value = "${mq.config.exchange}",type = ExchangeTypes.FANOUT)
))
public class RedReceiver {

    @RabbitHandler
    public void process(String msg){
        System.out.println("发红包已订阅消息中间件:"+msg);
    }
}
