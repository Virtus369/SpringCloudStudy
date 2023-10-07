package com.virtus.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenfeignConfig {

    @Bean
    Logger.Level feignLoggerLever(){
//  NONE BASIC HEADERS FULL四種等級除錯改用FULL
      return Logger.Level.BASIC;
    }
}
