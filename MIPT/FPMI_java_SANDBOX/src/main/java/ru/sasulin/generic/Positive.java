package ru.sasulin.generic;

public class Positive implements Applyable<Integer, Integer>{

    @Override
    public Integer apply(Integer integer) {
        if (integer < 0) {
            return -integer;
        }
        return integer;
    }
}