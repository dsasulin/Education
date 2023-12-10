package org.example;

import static java.lang.Math.*;

class Line {
    Point a,b;

    Line(Point a,Point b){
        this.a = a;
        this.b = b;
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
