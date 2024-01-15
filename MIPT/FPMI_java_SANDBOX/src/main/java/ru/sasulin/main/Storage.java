package ru.sasulin.main;

public class Storage<T> {

    final T obj;

    private Storage(T obj) {
        this.obj = obj;
    }

    public static<V> Storage<V> createStorage(V obj){
        return new Storage<>(obj);
    }

    public <T>  Storage<T> getObject(T defaultValue){
        if (this.obj == null) {
            return new Storage<T>(defaultValue);
        }
        return (Storage<T>) this.obj;
    }

}
