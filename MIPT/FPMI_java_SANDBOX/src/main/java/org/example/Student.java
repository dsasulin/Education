package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String name;
    int[] rates;

    Student(String name){
        this(name,new int[0]);
    }
    Student(String name, int[] rates){
        this.name = name;
        this.rates = rates;
    }

    public String toString() {
        String res;
        res = this.name + ": ";
        int i = 0;
        for (i = 0; i < this.rates.length; i++) {
            if (i == 0) {
                res = res + this.rates[i];
            }else {
                res = res + "," + this.rates[i];
            }
        }


        return res;
    }
}
