package ru.sasulin.geometry;

import java.util.ArrayList;
import java.util.List;

public class FigureMover implements Moveable{

    private List<Moveable> Moveable;

    public FigureMover() {}

    public ArrayList<Moveable> getFigures() {
        return new ArrayList<Moveable>(Moveable);
    }

    public void addFigure(Figure figure){
        this.Moveable.add(figure);
    }

    @Override
    public void move(int x, int y) {
        for (Moveable figure: Moveable){
            figure.move(x,y);
        }
    }
}
