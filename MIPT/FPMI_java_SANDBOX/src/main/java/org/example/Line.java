package org.example;

import static java.lang.Math.*;

class Line {
    private Point a,b;

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = new Point(a.x,a.y);
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = new Point(b.x,b.y);
    }

    Line(Point a, Point b){
        this.a = new Point(a.x,a.y);
        this.b = new Point(b.x,b.y);
    }
    Line(int x1, int y1, int x2, int y2){
        this(new Point(x1,y1),new Point(x2,y2));
    }

    public void lenght() {
        int l = 0;
        l = (int) sqrt(pow((this.b.x - this.a.x), 2) + pow((this.b.y - this.a.y), 2));
        System.out.println(l);
    }

    public String toString(){
        String s1 = "Line from "  + a +  " to " + b +"";
        return s1;
    }
}
