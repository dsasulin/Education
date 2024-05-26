package ru.sasulin.generic;

import java.util.List;

public interface Reductable<T> {
    T red(T x1, T x2);
}