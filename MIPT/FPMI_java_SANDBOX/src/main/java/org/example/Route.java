package org.example;

public class Route {
    private City city;
    private int cost;

    public City getCity() {
        return city;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    Route(City city, int cost){
        this.city = city;
        this.cost = cost;
    }

    public String toString() {
        String res;
        res = this.city.getName() + ":" + this.cost;

        return res;}

}
