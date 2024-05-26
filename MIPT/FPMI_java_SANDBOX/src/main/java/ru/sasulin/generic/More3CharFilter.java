package ru.sasulin.generic;

public class More3CharFilter implements Testable<String>{
    @Override
    public boolean test(String s) {
        return s.length() > 3;
    }
}
