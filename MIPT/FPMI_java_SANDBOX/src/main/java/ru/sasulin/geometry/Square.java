package ru.sasulin.geometry;

import java.util.ArrayList;

public class Square  extends Figure implements Lenghtable, Curvedable{
    Point start;
    private int side;

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side <= 0 ) {
            throw new IllegalArgumentException();
        }
        this.side = side;
    }

    public Square(Point start, int side){
        this.start = start;
        if (side <= 0 ) {
            throw new IllegalArgumentException();
        }
        this.side = side;
    }
    Square(int x, int y, int side){
        this(new Point(x,y), side);
    }

    public CurvedCircled createCurved(){
        CurvedCircled res = null;
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(this.start);
        Point p2,p3,p4;
        p2 = new Point(this.start.getX() + side, this.start.getY());
        p3 = new Point(p2.getX(), p2.getY() - side);
        p4 = new Point(p3.getX() - side, p3.getY() + side);
        points.add(p2);
        points.add(p3);
        points.add(p4);
        res = new CurvedCircled(points);
        return res;
    }
    public String toString() {
        String res;
        res = "Квадрат в точке " + this.start + " со стороной " + side;
        return res;
    }

    @Override
    public int square() {
        return this.side * this.side;
    }

    @Override
    public int lenght() {
        return this.side * 4;
    }

    @Override
    public CurvedCircled getPolygonalChain() {
        return this.createCurved();
    }
}
