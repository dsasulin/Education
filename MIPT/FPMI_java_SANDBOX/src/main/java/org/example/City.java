package org.example;

import java.util.ArrayList;

public class City {

    String name;
    ArrayList<Route> routes = new ArrayList<Route>();

    City(String name){
        this.name = name;
    }
    City(String name, ArrayList<Route> routes){
        this.name = name;
        this.routes = routes;
    }



    public String toString() {
        String res;
        res = this.name + " ";
        for (int i = 0; i < this.routes.size(); i++){
            res = res + this.routes.get(i).city.name + ":" + this.routes.get(i).cost + " ";
        }
        return res;

    }

}
