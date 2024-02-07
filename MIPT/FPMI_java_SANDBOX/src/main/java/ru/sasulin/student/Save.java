package ru.sasulin.student;

import java.util.ArrayList;
import java.util.Stack;

public class Save{

    String name;

    ArrayList<Integer> rates = new ArrayList<Integer>();

    public Save(String s) {
    }


    @Override
    public String toString() {
        return "Save{" +
                "name='" + name + '\'' +
                ", rates=" + rates +
                '}';
    }
}
