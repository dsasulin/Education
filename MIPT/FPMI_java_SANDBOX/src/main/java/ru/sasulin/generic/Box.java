package ru.sasulin.generic;

public class Box<T> {

    private T item;

    public boolean isFull() {
        return this.getItem() != null;
    }

    public void putItem(T item) {
        if (!this.isFull()) {
            this.item = item;
        } else throw new IllegalArgumentException("Box is full");
    }

    public T getItem() {
        T tmp = item;
        item = null;
        return tmp;
    }

}
