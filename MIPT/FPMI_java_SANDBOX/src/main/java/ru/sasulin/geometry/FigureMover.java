package ru.sasulin.geometry;

import java.util.ArrayList;

public class FigureMover implements Moveable{

    private ArrayList<Figure> figures = new ArrayList<Figure>();

    public FigureMover() {}

    public ArrayList<Figure> getFigures() {
        return new ArrayList<Figure>(figures);
    }

    public void addFigure(Figure figure){
        this.figures.add(figure);
    }

    @Override
    public void move(int x, int y) {
        for (Figure figure: figures){
            figure.move(x,y);
        }
    }
}
