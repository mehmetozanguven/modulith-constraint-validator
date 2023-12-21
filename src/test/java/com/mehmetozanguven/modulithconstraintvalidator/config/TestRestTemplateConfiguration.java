package com.mehmetozanguven.modulithconstraintvalidator.config;

import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestRestTemplateConfiguration {

    @Bean
    public TestRestTemplate appRestTestTemplate() {
        return new TestRestTemplate();
    }
}
