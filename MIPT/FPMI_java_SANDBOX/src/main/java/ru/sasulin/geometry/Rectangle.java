package ru.sasulin.geometry;

public class Rectangle extends Figure implements Moveable{
    private Point start;
    private int sideA, sideB;

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    Rectangle(Point start, int sideA, int sideB){
        this.start = start;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int square() {
        return this.sideB * this.sideB;
    }

    @Override
    int lenght() {
        return (sideB + sideA ) * 2 ;
    }

    @Override
    public void move(int x, int y) {
        start.move(x,y);
    }
}
