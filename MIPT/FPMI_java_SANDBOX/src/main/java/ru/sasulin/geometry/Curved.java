package ru.sasulin.geometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Curved implements Moveable{

    public ArrayList<Point> points = new ArrayList<Point>();
    public Curved(){}
    public Curved(Point[] points){
        this.points = new ArrayList<>(Arrays.asList(points));
    }
    public Curved(List<Point> points){
        this.points = new ArrayList<>(points);
    }
    Curved(ArrayList<Point> points){
        this.points = points;
    }

    public Curved addPoints(Point... point){
        Curved res = null;
        ArrayList<Point> newPoints = null;
        newPoints = this.points;
        newPoints.addAll(Arrays.asList(point));
        res = new Curved(newPoints);
        return res;
    }
    public void addPointsArray(Point[] points){
        for (Point point : points) {
            this.addPoints(point);
        }
    }

    public int lenght() {
        int res = 0;
        if (this.points.isEmpty() ||  this.points.size() == 1 ){
            return res;
        }else {
            for (int i = 0; i < this.points.size() - 1; i++) {
                res = res + (int) sqrt(pow((this.points.get(i + 1).getX() - this.points.get(i).getX()), 2) + pow((this.points.get(i + 1).getY() - this.points.get(i).getY()), 2));
            }
        }
        return res;
    }

    public String toString() {
        StringBuilder res;
        res = new StringBuilder("Линия ");
        int i ;
        for (i = 0; i < this.points.size(); i++) {
            if (i == 0) {
                res.append(this.points.get(i));
            }else {
                res.append(",").append(this.points.get(i));
            }
        }

        return res.toString();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curved curved = (Curved) o;
        return Objects.equals(points, curved.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

    @Override
    public void move(int x, int y) {
        for (Point point: points){
            point.move(x,y);
        }
    }
}