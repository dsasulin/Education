package ru.sasulin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.sasulin.reflection.ToString;

@Component
@Qualifier("red")
@ToString
public class RedColor implements Color {

    @Autowired
    @Qualifier("yellowGreen")
    Color nextColor;

    private RedColor() {
    }

    @Override
    public Color next() {
        return nextColor;
    }

    @Override
    public String toString() {
        return "Red";
    }
}
