package org.example;

public class Route {
    City city;
    int cost;

    Route(City city, int cost){
        this.city = city;
        this.cost = cost;
    }

    public String toString() {
        String res;
        res = this.city.name + ":" + this.cost;

        return res;}

}
