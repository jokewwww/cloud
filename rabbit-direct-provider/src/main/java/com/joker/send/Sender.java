package com.joker.send;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sender {

  @Autowired private AmqpTemplate amqpTemplate;

  @Value("${mq.config.exchange}")
  private String exchange;

  @Value("${mq.config.queue.info.routing.key}")
  private String routingKey;

  public void send(String str) {
    /** 参数一:交换器名称 参数二:路由键 参数三:消息 */
    System.out.println("开始发送数据");
    amqpTemplate.convertAndSend(this.exchange,this.routingKey, str);
  }
}
