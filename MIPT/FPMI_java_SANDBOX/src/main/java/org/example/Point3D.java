package org.example;

public class Point3D extends Point{

    int z;

    Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;

    }
    public String toString(){
        String s1 = "{" + x + ";" + y + ";" + z + "}";
        return s1;
    }
}
