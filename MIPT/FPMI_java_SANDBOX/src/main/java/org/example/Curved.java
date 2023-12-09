package org.example;

public class Curved {

    Point[] points;

    Curved(){}
    Curved(Point[] points){
        this.points = points;
    }

    public String toString() {
        String res;
        res = "Линия ";
        int i ;
        for (i = 0; i < this.points.length; i++) {
            if (i == 0) {
                res = res + this.points[i];
            }else {
                res = res + "," + this.points[i];
            }
        }

        return res;

    }
}
