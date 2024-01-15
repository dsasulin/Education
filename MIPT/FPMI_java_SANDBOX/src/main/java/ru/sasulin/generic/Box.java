package ru.sasulin.generic;

public class Box<T> {

    T item;

    public Box(T item) {
        this.item = item;
    }
    public void setItem(T item) throws RuntimeException {
        if (this.isEmpty() == false) throw new RuntimeException("Box is full");
        if (this.isEmpty() == true) {this.item = item;};
    }

    public T getItem(){
        T res = this.item;
        this.item = null;
        return  res;
    }

    public boolean isEmpty(){
        boolean res = false;
        if (this.item == null ) res = true;
        if (this.item != null ) res = false;
        return res;
    }

}
