package com.joker.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息队列接收者
 */
@Component
public class RabbitReceiver {

    /**
     * 接收消息的方法
     */
    @RabbitListener(queues = {"hello-queue"})
    public void process(String msg){

        System.out.println("receiver:..."+msg);
    }

}
