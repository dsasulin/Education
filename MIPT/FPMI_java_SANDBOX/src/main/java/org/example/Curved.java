package org.example;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Curved {

    ArrayList<Point> points = new ArrayList<Point>();
    Curved(){}
    Curved(Point[] points){
        this.points = new ArrayList<>(Arrays.asList(points));
    }
    Curved(ArrayList<Point> points){
        this.points = points;
    }

    public Curved addPoints(Point... point){
        Curved res = null;
        ArrayList<Point> newPoints = null;
        newPoints = this.points;
        for (int i = 0; i < point.length; i++){
            newPoints.add(point[i]);
        }
        res = new Curved(newPoints);
        return res;
    }
    public void addPointsArray(Point[] points){
        for (int i = 0; i < points.length; i++){
            this.addPoints(points[i]);
        }
    }

    public int lenght() {
        int res = 0;
        if (this.points.size() == 0 ||  this.points.size() == 1 ){
            return res;
        }else {
            for (int i = 0; i < this.points.size() - 1; i++) {
                res = res + (int) sqrt(pow((this.points.get(i + 1).x - this.points.get(i).x), 2) + pow((this.points.get(i + 1).y - this.points.get(i).y), 2));
            }
        }
        return res;
    }

    public String toString() {
        String res;
        res = "Линия ";
        int i ;
        for (i = 0; i < this.points.size(); i++) {
            if (i == 0) {
                res = res + this.points.get(i);
            }else {
                res = res + "," + this.points.get(i);
            }
        }

        return res;

    }
}
// 3 + 6 +  6