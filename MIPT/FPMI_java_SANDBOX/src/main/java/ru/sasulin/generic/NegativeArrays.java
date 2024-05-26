package ru.sasulin.generic;

public class NegativeArrays implements Testable<Integer[]> {
    @Override
    public boolean test(Integer[] integers) {
        for (int i : integers) {
            return i < 0;
        }
        return false;
    }
}
