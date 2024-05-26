package ru.sasulin.generic;
import java.util.List;

public class Concat implements Reductable<String> {

    @Override
    public String red(String string, String string2) {
        return string + string2;
    }
}