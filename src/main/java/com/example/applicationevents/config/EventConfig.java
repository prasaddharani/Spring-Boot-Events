package com.example.applicationevents.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;

@Slf4j
@Configuration
public class EventConfig {

    @Bean
    public ApplicationEventMulticaster applicationEventMulticaster () {
        SimpleApplicationEventMulticaster simpleApplicationEventMulticaster =
                new SimpleApplicationEventMulticaster();
        simpleApplicationEventMulticaster.setErrorHandler(error -> {
            log.info("Error occurred: {}", error.getMessage());
        });
        return simpleApplicationEventMulticaster;
    }
}
