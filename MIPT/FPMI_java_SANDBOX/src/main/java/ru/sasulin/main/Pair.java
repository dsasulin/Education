package ru.sasulin.main;

public class Pair {

    String name;
    String num;

    public Pair(String name, String num) {
        this.name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        this.num = num;
    }
}
