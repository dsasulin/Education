package ru.sasulin.spring;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import ru.sasulin.student.Student;


import java.util.function.Predicate;

@Component

public class StudentBuilder {

    @Getter
    public String name;

    @Autowired
    Predicate<Integer> range;

    public Student createStudent(String name, int... grades) {
        return new Student(name, range, grades);
    }

    @Override
    public String toString() {
        return "StudentBuilder{" +
                "name='" + name +
                '}';
    }
}
