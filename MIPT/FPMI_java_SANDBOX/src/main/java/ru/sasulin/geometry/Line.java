package ru.sasulin.geometry;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

import static java.lang.Math.*;

@Setter
@Getter
public class Line<T extends Point> implements Lenghtable, Cloneable, Moveable {
    private T start,end;

    public Line(T start, T end) {
        this.start = start;
        this.end = end;
    }
    public static Line<Point> of(int x1, int y1, int x2, int y2) {
        return new Line<>(new Point(x1, y1), new Point(x2, y2));
    }

    public static <E extends Point> Line<E> of(E start, E end) {
        return new Line<>(start, end);
    }

    public int lenght() {
        int l = 0;
        l = (int) sqrt(pow((this.end.getX() - this.start.getX()), 2) + pow((this.end.getY() - this.start.getY()), 2));
        return l;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(start, line.start) && Objects.equals(end, line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    public String toString(){
        return "Line from "  + start +  " to " + end;
    }

    @Override
    public Line clone() {
        Line line = null;
        try {
            line = (Line) super.clone();
            line.start = line.start.clone();
            line.end = line.end.clone();
            return line;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void move(int x, int y) {
        start.move(x,y);
        end.move(x,y);
    }
}
