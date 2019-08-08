package com.joker.appliation;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.joker")
@SpringBootApplication
public class FanoutConsumerApplication {
  public static void main(String[] args) {
      SpringApplication.run(FanoutConsumerApplication.class,args);
  }
}
