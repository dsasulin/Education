package org.example;

public class Point {

    int x,y;

    Point(int x, int y){
        this.x = x;
        this.y =y;
    }
    public String toString(){
        String s1 = "{" + x + ";" + y + "}";
        return s1;
    }
}
