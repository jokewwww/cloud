package com.joker.receive;


import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(bindings =
        @QueueBinding(key = "${mq.config.queue.error.routing.key}"
                ,value = @Queue(value ="${mq.config.queue.error}",autoDelete = "true")
                ,exchange = @Exchange(value = "${mq.config.exchange}",type = ExchangeTypes.DIRECT))
)
public class ErrorReceive {
    @RabbitHandler
    public void process(String str){
        System.out.println("error...receive..."+str);
    }
}
