package ru.sasulin.reflection;

import ru.sasulin.tests.MyEntityTest;

@Validate(MyEntityTest.class)
public class MyEntity extends Entity{
    public int x = 42;
    @ToString(NeedToString.YES)
    public String res;
}
