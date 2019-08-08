package com.joker.send;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrderSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${mq.config.exchange}")
    String exchange;


    public void send(String msg){
        rabbitTemplate.convertAndSend(exchange,"order.log.debug","order.log.debug"+msg);
        rabbitTemplate.convertAndSend(exchange,"order.log.info","order.log.info"+msg);
        rabbitTemplate.convertAndSend(exchange,"order.log.warn","order.log.warn"+msg);
        rabbitTemplate.convertAndSend(exchange,"order.log.error","order.log.error"+msg);
    }
}
