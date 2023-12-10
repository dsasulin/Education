package org.example;

import java.util.ArrayList;

public class Square {
    Point start;
    int side;

    Square(Point start, int side){
        this.start = start;
        this.side = side;
    }
    Square(int x, int y, int side){
        this(new Point(x,y), side);
    }

    public Curved createCurved(){
        Curved res = null;
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(this.start);
        Point p2,p3,p4;
        p2 = new Point(this.start.x + side, this.start.y);
        p3 = new Point(p2.x, p2.y - side);
        p4 = new Point(p3.x-side, p3.y + side);
        points.add(p2);
        points.add(p3);
        points.add(p4);
        res = new Curved(points);
        return res;
    }
    public String toString() {
        String res;
        res = "Квадрат в точке " + this.start + " со стороной " + side;
        return res;
    }
}
