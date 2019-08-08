package com.joker.receiver;


import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.stereotype.Component;

@RabbitListener(bindings = @QueueBinding(
        value =@Queue(value = "${mq.config.queue.error}",autoDelete = "true"),
        exchange = @Exchange(value = "${mp.config.exchange}",type = ExchangeTypes.TOPIC),
        key = "*.log.error"
))
@Component
public class RrrorReceiver {
    @RabbitHandler
    public void process(String msg){
        System.out.println("error......receiver:"+msg);
    }
}
