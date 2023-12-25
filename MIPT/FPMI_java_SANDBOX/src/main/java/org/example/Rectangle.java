package org.example;

public class Rectangle extends Figure{
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
    int square() {
        return this.sideB * this.sideB;
    }

    @Override
    int lenght() {
        return (sideB + sideA ) * 2 ;
    }
}
