package ru.sasulin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("yellowGreen")
@Component
public class YellowGreen implements Color {

    @Autowired
    @Qualifier("startcolor")
    Color nextColor;

    private YellowGreen() {
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
