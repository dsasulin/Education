package ru.sasulin.generic;

public class NegativeFilter implements Testable<Integer>{
    @Override
    public boolean test(Integer integer) {
        return integer < 0;
    }
}
