package com.joker.receiver;


import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;



@RabbitListener(bindings = @QueueBinding(
        value = @Queue(value = "${mq.config.queue.info}",autoDelete = "true"),
        exchange = @Exchange(value = "${mp.config.exchange}",type = ExchangeTypes.TOPIC),
        key = "*.log.info"

)
)
@Component
public class InfoReceiver {

    @RabbitHandler
    public void process(String msg){
        System.out.println("info.......receiver:"+msg);
    }
}














































































