package com.joker.test;


import com.joker.application.FanoutProviderApplication;
import com.joker.send.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FanoutProviderApplication.class)
public class FanoutProvideTest {

    @Autowired
    private Sender sender;

    @Test
    public void test(){
        sender.send("fanout....send ....");
    }
}
