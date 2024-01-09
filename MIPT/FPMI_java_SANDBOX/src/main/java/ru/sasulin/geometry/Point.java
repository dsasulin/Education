package ru.sasulin.geometry;

public class Point {

    private int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y){
        this.x = x;
        this.y =y;
    }
    public String toString(){
        String s1 = "{" + x + ";" + y + "}";
        return s1;
    }
}