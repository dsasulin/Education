package ru.sasulin.geometry;

import java.util.ArrayList;
import java.util.List;

public class Group implements Moveable{

    private List<Moveable> list;

    public Group(Moveable... moveables) {
        list = new ArrayList<>(List.of(moveables));
    }

    public static Group of (Moveable... moveables){
        return new Group(moveables);
    }


    @Override
    public void move(int x, int y) {
        for (Moveable moveables: list){
            moveables.move(x,y);
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "list=" + list +
                '}';
    }
}
