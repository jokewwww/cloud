package com.joker.componnet;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息队列发送者
 */
@Component
public class Sender {
    
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String msg){
        /**
         *功能描述
         *@param:
         *@param:
         */
        rabbitTemplate.convertAndSend("hello-queue",msg);
    }
}
