package org.example;

import java.util.ArrayList;

public class City {

    private String name;
    private ArrayList<Route> routes = new ArrayList<Route>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(ArrayList<Route> routes) {
        this.routes = new ArrayList<>(routes);
    }

    City(String name){
        this.name = name;
    }
    City(String name, ArrayList<Route> routes){
        this.name = name;
        this.routes = new ArrayList<>(routes);
    }

    public void addRoute(ArrayList<Route> routes){
        for (int i = 0; i < routes.size(); i++){
            boolean exists = false;
            for(int j = 0; j < this.routes.size(); j++){
                if (routes.get(i).getCity() == this.routes.get(j).getCity()){
                    this.routes.get(j).setCost(routes.get(i).getCost());
                    exists = true;
                    break;
                }
            }
            if(!exists){
                this.routes.add(routes.get(i));
            }
        }
    }

    public String toString() {
        String res;
        res = this.name + " ";
        for (int i = 0; i < this.routes.size(); i++){
            res = res + this.routes.get(i).getCity().name + ":" + this.routes.get(i).getCost() + " ";
        }
        return res;

    }

}
