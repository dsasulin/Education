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

    public int avg(){
        int res = 0;
        if (this.rates.length == 0) {
            return res;
        }else{
            for(int i = 0; i < this.rates.length; i++){
                res = res + this.rates[i];
            }
        }
        res = res / this.rates.length;
        return res;
    }

    public boolean isFive(){
        boolean res = false;
        if (this.rates.length > 0) {
                res = true;
                for (int i = 0; i < this.rates.length; i++){
                    if (this.rates[i] != 5){
                        res = false;
                    }
                }
        };
        return res;
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
        res = res + ", средний бал: " + this.avg() + ", Отличник: " + this.isFive();
        return res ;
    }
}
