package ru.sasulin.spring;

import ru.sasulin.reflection.Test;

public class GreenColorTest {
    @Test
    public void test1(GreenColor greenColor) {
        if (greenColor.toString() == null) throw new RuntimeException("Validation exception");
    }
}
