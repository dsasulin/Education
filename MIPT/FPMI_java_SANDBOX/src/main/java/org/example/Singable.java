package org.example;

public interface Singable {

    default void sing(Bird... birds){
        for (Bird bird:birds){
            System.out.println(bird.Sing());
        }

    }
}
