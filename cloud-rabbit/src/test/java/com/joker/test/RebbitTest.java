package com.joker.test;


import com.joker.application.ServerApplication;
import com.joker.componnet.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServerApplication.class)
public class RebbitTest {

    @Autowired
    private Sender sender;
    @Test
    public void test1() throws InterruptedException {

            sender.send("rabbit....go...");

    }

}
