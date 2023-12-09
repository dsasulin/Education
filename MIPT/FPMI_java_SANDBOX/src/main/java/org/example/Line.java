package org.example;

class Line {
    Point a,b;

    Line(Point a,Point b){
        this.a = a;
        this.b =b;
    }
    Line(int x1, int y1, int x2, int y2){
        this.a.x = x1;
        this.a.y = y1;
        this.b.x = x2;
        this.b.y = y2;
    }

    public String toString(){
        String s1 = "Line from "  + a +  " to " + b +"";
        return s1;
    }
}
