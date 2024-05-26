package ru.sasulin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.sasulin.reflection.Validate;

@Component
@Qualifier("startcolor")
@Validate(GreenColorTest.class)
public class GreenColor implements Color {

    @Autowired
    @Qualifier("red")
    //@Qualifier("yellowGreen")

    Color nextColor;

    private GreenColor() {
    }

    @Override
    public Color next() {
        return nextColor;
    }

    @Override
    public String toString() {
        return "Green";
    }
}
