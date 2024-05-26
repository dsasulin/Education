package ru.sasulin.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import ru.sasulin.student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import java.util.Date;
import java.util.Random;

@Configuration
public class SimpleBeans {
    @Bean
    String hello(){
        return "Hello World";
    }
    @Bean
    int random(){
        Random rd = new Random();
        return  rd.nextInt(min(),max());
    }

    @Bean
    @Lazy
    public Date origin() {
        return new Date();
    }

    @Bean
    public Predicate<Integer> range() {
        return i -> i >= 2 && i <= 5;
    }

    @Bean
    public int min() {
        return 0;
    }
    @Bean
    public int max() {
        return 99;
    }

    @Bean
    public Review good() {
        return new Review("Очень хорошо", 4);
    }

    @Bean
    public Review normally() {
        return new Review("Сойдет", 3);
    }

    @Bean
    public Review unclear(int random) {
        return new Review("Сложно сказать", random);
    }

    @Bean
    @Scope("prototype")
    public Review best(List<Review> list) {
        list.sort((o1, o2) -> o2.grade - o1.grade);
        return list.get(0);
    }
    @Bean
    public Student student1(Predicate<Integer> range) {
        return new Student("name1", (Predicate<Integer>) range);
    }

    @Bean
    public Student student2(Predicate<Integer> range, int... grades) {
        return new Student("name2", range, grades);
    }
    @Bean
    public StudentBuilder studentBuilder() {
        return new StudentBuilder();
    }

}
