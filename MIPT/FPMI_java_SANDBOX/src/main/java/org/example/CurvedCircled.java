package org.example;

import java.util.ArrayList;

public class CurvedCircled extends Curved{
    public Curved addPoints(Point... point){
        Curved res = null;
        ArrayList<Point> newPoints = null;
        newPoints = this.points;
        for (int i = 0; i < point.length; i++){
            newPoints.add(point[i]);
        }
        newPoints.add(point[0]);
        res = new Curved(newPoints);
        return res;
    }
}
