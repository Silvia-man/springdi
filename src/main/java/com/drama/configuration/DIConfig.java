package com.drama.configuration;

import com.drama.services.EmailService;
import com.drama.services.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import java.util.ServiceConfigurationError;

@Configuration
@ComponentScan(value = {"com.drama.consumer"})
public class DIConfig {
    @Bean
    public Service getService() {
        return new EmailService();
    }
}

