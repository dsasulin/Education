package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String name;
    private int[] rates;

    public int[] getRates() {
        return rates.clone();
    }

    public void setRates(int[] rates) {
        for(int i = 0; i < rates.length;i++){
            if (rates[i] < 2 || rates[i] > 5){
                throw new IllegalArgumentException("Оценка не может быть меньше 2 и больше 5");
            }
        }
        this.rates = rates.clone();
    }

    Student(String name){
        this(name,new int[0]);
    }
    Student(String name, int[] rates){
        for(int i = 0; i < rates.length;i++){
            if (rates[i] < 2 || rates[i] > 5){
                throw new IllegalArgumentException("Оценка не может быть меньше 2 и больше 5");
            }
        }
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
