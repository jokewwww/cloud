package com.joker.application;

import com.joker.send.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.joker")

public class ProvadeApplication {

  public static void main(String[] args) {

      SpringApplication.run(ProvadeApplication.class,args);


  }
}
