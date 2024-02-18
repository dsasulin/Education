package ru.sasulin.geometry;

public class Point3D extends Point {

    int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;

    }
    public String toString(){
        return "{" + super.getX() + ";" + super.getY() + ";" + getZ() + "}";
    }


}
