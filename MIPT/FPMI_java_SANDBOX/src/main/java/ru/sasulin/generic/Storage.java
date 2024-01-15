package ru.sasulin.generic;

public class Storage<T> {

    final T obj;

    public Storage(T obj) {
        this.obj = obj;
    }

    public static<T> Storage<T> createStorage(T obj){
        return new Storage<>(obj);
    }

    public <T>  Storage<T> getObject(T defaultValue){
        if (this.obj == null) {
            return new Storage<T>(defaultValue);
        }
        return (Storage<T>) this.obj;
    }


}
