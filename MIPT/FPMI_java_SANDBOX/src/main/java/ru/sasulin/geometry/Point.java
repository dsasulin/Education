package ru.sasulin.geometry;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Point implements Cloneable, Comparable{

    private int x,y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "{" + x + ";" + y + "}";
    }

    public void move (int x, int y) {
        this.setX(this.getX() + x);
        this.setY(this.getY() + y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public Point clone(){
        try {
            return (Point)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int compareTo(Object o) {
        int res = 0;
        Point np = (Point) o;
        if(np.x < this.x) {res = 1;}
        if(np.x > this.x) {res = -1;}
        return res;
    }
}
