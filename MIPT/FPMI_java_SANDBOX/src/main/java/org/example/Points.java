package org.example;

import java.util.ArrayList;
import java.util.List;

public class Points {

    private List<Attribute> list = new ArrayList<>();

    public Points(List<Attribute> list) {
        this.list = list;
    }

    public Object getAttribute (String name){
        for (Attribute at: list){
            if(at.getName().equals(name)){return at.getValue();}
        }
        return null;
    }

    public void setAttribute(String name, Object value){
        this.list.add(new Attribute(name,value));
    }

    @Override
    public String toString() {
        return "Points " + list ;
    }
}
