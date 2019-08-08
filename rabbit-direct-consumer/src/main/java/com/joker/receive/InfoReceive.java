package com.joker.receive;


import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * RabbitListener bindings:绑定队列
 *                  key:配置路由键
 *                  exchange:配置交换器
 *                      @Exchange
 *                          value: 为交换器起个名称
 *                          type: 指定具体的交换器类型
 *                  QueueBinding:绑定队列的详细配置
 *                      value:队列名称
 *                      autoDelete:是否是一个可删除的临时队列
 *
 */
@Component
@RabbitListener(bindings = @QueueBinding(
                    value =@Queue(value = "${mq.config.queue.info}",autoDelete = "false")
                    ,exchange =@Exchange(value = "${mq.config.exchange}",type = ExchangeTypes.DIRECT)
                    ,key ="${mq.config.queue.info.routing.key}")
)
public class InfoReceive {

    @RabbitHandler
    public void process(String msg){
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<msg:"+msg);
            System.out.println("info....receive...."+msg);

    }
}
