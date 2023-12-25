package org.example;

public class Circle extends Figure{
    private Point center;
    private int r;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    Circle(Point center, int r){
        this.center = center;
        this.r = r;
    }
    @Override
    int square() {
        return (int) (Math.PI * Math.pow(this.r, 2));
    }

    @Override
    int lenght() {
        return (int) (2 * this.r * Math.PI);
    }
}
