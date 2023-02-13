package com.example.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.repository.support.DomainClassConverter;

@Configuration
public class DataConfiguration {
    @Bean
    @Autowired
    @SuppressWarnings("unchecked")
    public DomainClassConverter domainClassConverter(ConversionService cs) {
        return new DomainClassConverter(cs);
    }
}
