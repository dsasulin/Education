package ru.sasulin.geometry;

import static java.lang.Math.*;

public class Line {
    private Point a,b;

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = new Point(a.getX(),a.getY());
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = new Point(b.getX(),b.getY());
    }

    public Line(Point a, Point b){
        this.a = new Point(a.getX(),a.getY());
        this.b = new Point(b.getX(),b.getY());
    }
    Line(int x1, int y1, int x2, int y2){
        this(new Point(x1,y1),new Point(x2,y2));
    }

    public int lenght() {
        int l = 0;
        l = (int) sqrt(pow((this.b.getX() - this.a.getX()), 2) + pow((this.b.getY() - this.a.getY()), 2));
        return l;
    }

    public String toString(){
        String s1 = "Line from "  + a +  " to " + b +"";
        return s1;
    }
}
