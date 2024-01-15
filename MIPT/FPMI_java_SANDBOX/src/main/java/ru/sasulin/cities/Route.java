package ru.sasulin.cities;

import java.util.Objects;

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

    public Route(City city, int cost){
        this.city = city;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return cost == route.cost && city == route.city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(city.getName(), cost);
    }

    public String toString() {
        String res;
        res = this.city.getName() + ":" + this.cost;

        return res;}

}
