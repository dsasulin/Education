package org.example;

public interface Squareble{

    default void square(Figure... figures){
        int res = 0;
        for(Figure figure:figures){
            res = res + figure.square();
        }
        System.out.println(res);
    }
}
