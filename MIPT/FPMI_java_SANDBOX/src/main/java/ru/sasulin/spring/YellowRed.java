package ru.sasulin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("yellowRed")
@Component
public class YellowRed implements Color {

    @Autowired
    @Qualifier("red")
    Color nextColor;

    private YellowRed() {
    }

    @Override
    public Color next() {
        return nextColor;
    }

    @Override
    public String toString() {
        return "Yellow";
    }
}
