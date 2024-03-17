package ru.sasulin.tests;

import ru.sasulin.reflection.MyEntity;
import ru.sasulin.reflection.Test;

public class MyEntityTest {

    @Test
    void test1(MyEntity myEntity) {
        if(myEntity.x != 42) {
            throw new ValidationException("x in MyEntity must be 42");
        }
    }
    @Test
    void test2(MyEntity myEntity) {
        if(myEntity.res == null) {
            throw new ValidationException("res in MyEntity must be not null");
        }
    }

}
