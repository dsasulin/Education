package ru.sasulin.generic;

public final class Storage<T> {
    private final T obj;

    private Storage(T obj) {
        this.obj = obj;
    }

    public static <V> Storage<V> createStorage(V v) {
        return new Storage<>(v);
    }

    public T getObject(T defaultValue) {
        if (obj == null) return defaultValue;
        else return this.obj;
    }

}
