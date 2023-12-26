package ru.sasulin.geometry;

import java.util.ArrayList;

public class CurvedCircled extends Curved{
    public CurvedCircled(ArrayList<Point> points) {
        super.points = points;
    }

    public Curved addPoints(Point... point){
        for (int i = 0; i < point.length; i++){
            this.points.add(point[i]);
        }
        this.points.add(point[0]);
        return this;
    }

}
