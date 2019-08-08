package com.joker.test;


import com.joker.application.TopicProviderApplication;
import com.joker.send.OrderSender;
import com.joker.send.ProductSender;
import com.joker.send.UserSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TopicProviderApplication.class)
public class TopicTest {

    @Autowired
    UserSender userSender;

    @Autowired
    ProductSender productSender;

    @Autowired
    OrderSender orderSender;

    @Test
    public void test(){
        userSender.send("user...topic 主题模式");
        productSender.send("product....Topic 主题模式");
        orderSender.send("order...Topic 主题模式");
    }

}
