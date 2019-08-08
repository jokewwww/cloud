package com.joker.test;


import com.joker.application.ProvadeApplication;
import com.joker.send.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProvadeApplication.class)
public class RabbitTest {

    @Autowired
    private Sender sender;

    @Test
    public void test() throws InterruptedException {

                TimeUnit.SECONDS.sleep(2);
                sender.send("rabbit-Direct模型....go ");
                throw new RuntimeException();
    }

}
