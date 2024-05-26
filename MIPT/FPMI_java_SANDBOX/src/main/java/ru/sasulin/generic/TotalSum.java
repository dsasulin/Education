package ru.sasulin.generic;

import java.util.List;


public class TotalSum implements Reductable<Integer> {

    @Override
    public Integer red(Integer integer1, Integer integer2) {
        return integer1 + integer2;
    }
}
