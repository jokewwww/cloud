package com.joker.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.joker")
@SpringBootApplication
public class ConsumerApplication {
  public static void main(String[] args) {
      SpringApplication.run(ConsumerApplication.class,args);
  }
}
