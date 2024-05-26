package ru.sasulin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TrafficLight {
    @Autowired
    @Qualifier("startcolor")
    Color color;

    @Bean
    @Scope("prototype")
    public String next() {
        color = color.next();
        return color.toString();
    }
}
