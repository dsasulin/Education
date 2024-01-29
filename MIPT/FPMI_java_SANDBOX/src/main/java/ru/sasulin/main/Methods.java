package ru.sasulin.main;

import ru.sasulin.animals.Bird;
import ru.sasulin.animals.Meoweble;
import ru.sasulin.cities.City;
import ru.sasulin.cities.CityWithBackRoad;
import ru.sasulin.cities.Route;
import ru.sasulin.generic.Storage;
import ru.sasulin.geometry.Figure;
import ru.sasulin.geometry.Lenghtable;
import ru.sasulin.geometry.Line;
import ru.sasulin.geometry.Point;

import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

import java.util.ArrayList;

public class Methods {

    public static Number added (Number... numbers){
        double res = 0;
        for (Number n:numbers ){
            res = res + n.doubleValue();
        }

        return res;

    }

    public static void singer(Bird... birds){
        for(Bird bird:birds){
            System.out.println(bird.Sing());
        }
    }

    public static Number allArea(Figure... figures){
        double res = 0 ;
        for (Figure figure: figures){
            res = res + figure.square();
        }
        return res;
    }

    public static void allMeow(Meoweble... cats){
        for(Meoweble cat: cats){
            cat.meow();
        }
    }

    public static Number allLen(Lenghtable... figures){
        double res = 0 ;
        for (Lenghtable figure: figures) {
            res = res + figure.lenght();
        }
        return res;
    }

    public static void cities(){
        City a = new CityWithBackRoad("A");
        City b = new City("B");
        City c = new City("C");
        City d = new CityWithBackRoad("D");
        City e = new City("E");
        Route ab = new Route(b,1);
        Route ac = new Route(c,1);
        ArrayList aRoutes = new ArrayList();
        aRoutes.add(ab);
        aRoutes.add(ac);
        a.addRoute(aRoutes);

        Route bc = new Route(c,1);
        Route bd = new Route(d,1);
        ArrayList bRoutes = new ArrayList();
        bRoutes.add(bc);
        bRoutes.add(bd);
        b.addRoute(bRoutes);

        Route db = new Route(b,1);
        Route de = new Route(e,1);
        ArrayList dRoutes = new ArrayList();
        dRoutes.add(db);
        dRoutes.add(de);
        d.addRoute(dRoutes);

        Route ec = new Route(c,1);
        ArrayList eRoutes = new ArrayList();
        eRoutes.add(ec);
        e.addRoute(eRoutes);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }

    public static int xPowY(String inx, String iny){
        int x, y, res ;
        x = parseInt(inx);
        y = parseInt(iny);
        res = (int) pow(x,y);
        return res;

    }

    public static Line shift(Line line){
        Point p1 = line.getA().clone();
        Point p2 = line.getB().clone();
        if (p1.getX() > 0) {p1.setX(p1.getX()+10);}
        if (p1.getX() < 0) {p1.setX(p1.getX()-10);}
        return new Line(p1,p2);
    }

    public static double max(Storage[] storages){
        return 0;
    }

}
