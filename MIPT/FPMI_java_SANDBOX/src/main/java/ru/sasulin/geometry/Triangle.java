package ru.sasulin.geometry;

import java.lang.management.MemoryPoolMXBean;

public class Triangle extends Figure implements Lenghtable, Moveable {
    private Point a,b,c;

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int square() {
        int res, pp, lenAB, lenBC, lenCA;
        Line ab = new Line(this.a, this.b);
        Line bc = new Line(this.b, this.c);
        Line ca = new Line(this.c, this.a);
        lenAB = ab.lenght();
        lenBC = bc.lenght();
        lenCA = ca.lenght();
        pp = (lenAB + lenBC + lenCA) / 2;
        res = (int) Math.sqrt(pp * (pp-lenAB) * (pp-lenBC) * (pp-lenCA));
        return res;
    }

    @Override
    public int  lenght() {
        int res, lenAB, lenBC, lenCA;
        Line ab = new Line(this.a, this.b);
        Line bc = new Line(this.b, this.c);
        Line ca = new Line(this.c, this.a);
        lenAB = ab.lenght();
        lenBC = bc.lenght();
        lenCA = ca.lenght();
        res = lenAB + lenBC + lenCA;
        return res;
    }
    @Override
    public void move(int x, int y) {
        a.move(x,y);
        b.move(x,y);
        c.move(x,y);
        }

}
