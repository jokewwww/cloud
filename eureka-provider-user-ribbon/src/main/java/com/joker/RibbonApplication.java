package com.joker;

import com.joker.annotion.ExcludeFromComponentScan;
import com.joker.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

@ComponentScan(excludeFilters ={@ComponentScan.Filter(type= FilterType.ANNOTATION,value = ExcludeFromComponentScan.class)})
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "user-provider", configuration = RibbonConfig.class)
public class RibbonApplication {

  @Bean
  @LoadBalanced
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

  public static void main(String[] args) {
    SpringApplication.run(RibbonApplication.class, args);
  }
}
