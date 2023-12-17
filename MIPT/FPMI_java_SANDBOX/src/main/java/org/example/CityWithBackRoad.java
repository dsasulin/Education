package org.example;

import java.util.ArrayList;

public class CityWithBackRoad extends City{


    CityWithBackRoad(String name) {
        super(name);
    }

    CityWithBackRoad(String name, ArrayList<Route> routes) {
        super(name, routes);
    }

    public void addRoute(ArrayList<Route> routes){
        for (int i = 0; i < routes.size(); i++){
            boolean exists = false;
            for(int j = 0; j < this.getRoutes().size(); j++){
                if (routes.get(i).getCity() == this.getRoutes().get(j).getCity()){
                    this.getRoutes().get(j).setCost(routes.get(i).getCost());
                    exists = true;
                    break;
                }
            }
            if(!exists){
                this.getRoutes().add(routes.get(i));
                Route newRoute = new Route(this, routes.get(i).getCost());
                ArrayList newRoutes = new ArrayList<>();
                newRoutes.add(newRoute);
                routes.get(i).getCity().addRoute(newRoutes);
            }
        }
    }
}
