package com.joker.config;


import com.joker.annotion.ExcludeFromComponentScan;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ExcludeFromComponentScan
public class RibbonConfig {

    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
