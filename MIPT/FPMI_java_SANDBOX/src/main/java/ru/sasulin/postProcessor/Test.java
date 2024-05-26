package ru.sasulin.postProcessor;

import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import ru.sasulin.reflection.Default;

@Component
@ToString
public class Test {
    String name = "test";
    String alias = "dd";
    @ru.sasulin.reflection.ToString
    Integer x;
}

@Configuration
class Config{
    @Bean
    String alias(){
        return "test";
    }

    @Bean
    Integer x(){
        return 77;
    }
}
