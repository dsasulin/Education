package ru.sasulin.geometry;

import java.util.Objects;

import static java.lang.Math.*;

public class Line extends Figure implements Cloneable, Moveable{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(a, line.a) && Objects.equals(b, line.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    public String toString(){
        String s1 = "Line from "  + a +  " to " + b +"";
        return s1;
    }

    @Override
    public Line clone() {
        Line line = null;
        try {
            line = (Line) super.clone();
            line.a = line.a.clone();
            line.b = line.b.clone();
            return line;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public int square() {
        return 0;
    }

    @Override
    public void move(int x, int y) {
        a.move(x,y);
        b.move(x,y);
    }
}
