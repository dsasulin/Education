package ru.sasulin.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class SimpleBeans {
    @Bean
    String bean1(){
        return "Hello World";
    }
    @Bean
    int bean2(){
        Random rd = new Random();
        return  rd.nextInt(0,99);
    }


}
