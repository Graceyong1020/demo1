package com.pgm.springdemo.config;

import com.pgm.springdemo.sample.SampleDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public SampleDTO myDto1() {
        String[] hobbies = {"movie", "cooking"};
        return new SampleDTO("grace", 20, hobbies);
    }
    @Bean
    public SampleDTO myDto2() {
        String[] hobbies = {"movie", "cooking"};
        return new SampleDTO("hervey", 20, hobbies);
    }

}
