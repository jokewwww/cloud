package com.joker.send;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${mq.config.exchange}")
    String exchange;

    public void send(String msg){
        rabbitTemplate.convertAndSend(exchange,"product.log.debug","product.log.debug......"+msg);
        rabbitTemplate.convertAndSend(exchange,"product.log.info","product.log.info......"+msg);
        rabbitTemplate.convertAndSend(exchange,"product.log.warn","product.log.warn......"+msg);
        rabbitTemplate.convertAndSend(exchange,"product.log.error","product.log.error....."+msg);
    }
}
