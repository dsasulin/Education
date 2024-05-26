package ru.sasulin.generic;

import java.util.ArrayList;
import java.util.List;

public class ListMax implements Applyable<Integer[], Integer> {

    @Override
    public Integer apply(Integer[] integers) {
        Integer max = integers[0];
        for (int i = 1; i < integers.length - 1; i++) {
            if (integers[i] > max) {
                max = integers[i];
            }
        }
        return max;
    }
}