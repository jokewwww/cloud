package com.joker.send;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${mq.config.exchange}")
    private String exchange;

    public void send(String str){
        rabbitTemplate.convertAndSend(exchange,"user.log.info","user.log.info..."+str);
        rabbitTemplate.convertAndSend(exchange,"user.log.debug","user.log.debug..."+str);
        rabbitTemplate.convertAndSend(exchange,"user.log.error","user.log.error..."+str);
        rabbitTemplate.convertAndSend(exchange,"user.log.warn","user.log.warn..."+str);
    }
}
