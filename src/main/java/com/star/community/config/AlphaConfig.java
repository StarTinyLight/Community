package com.star.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * @Author Star
 * @Date 2022/5/21 10:45
 * @Version 1.0
 */
@Configuration
//表示是一个普通的配置类，一般只有程序入口用@SpringBootApplication
public class AlphaConfig {
    @Bean
    public SimpleDateFormat SimpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
    }
}
