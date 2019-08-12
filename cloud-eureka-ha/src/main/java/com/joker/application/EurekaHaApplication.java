package com.joker.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaServer
@ComponentScan("com.joker")
@SpringBootApplication
public class EurekaHaApplication {

  public static void main(String[] args) {
      SpringApplication.run(EurekaHaApplication.class,args);
  }
}
