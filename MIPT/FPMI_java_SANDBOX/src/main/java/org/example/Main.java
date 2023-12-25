package org.example;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 2.1 -  " + Block12.fraction(5.25));
        System.out.println("Задача 2.2 -  " + Block12.sumLastNums(4568));
        System.out.println("Задача 2.3 -  " + Block12.charToNum('5'));
        System.out.println("Задача 2.4 -  " + Block12.isPositive(-12));
        System.out.println("Задача 2.5 -  " + Block12.is2Digits(-55));
        System.out.println("Задача 2.6 -  " + Block12.isUpperCase('Z'));
        System.out.println("Задача 2.7 -  " + Block12.isInRange(22,11,13));
        System.out.println("Задача 2.8 -  " + Block12.isDivisor(2,15));
        System.out.println("Задача 2.9 -  " + Block12.isEqual(2,15,2));
        System.out.println("Задача 2.10 -  " + Block12.lastNumSum(Block12.lastNumSum(Block12.lastNumSum(Block12.lastNumSum(5,11),123),14),1));
        System.out.println("Задача 3.1 -  " + Block3.abs(-5));
        System.out.println("Задача 3.2 -  " + Block3.safeDiv(3,0));
        System.out.println("Задача 3.3 -  " + Block3.max(3,5));
        System.out.println("Задача 3.4 -  " + Block3.makeDecision(5,3));
        System.out.println("Задача 3.5 -  " + Block3.max3(8,1,4));
        System.out.println("Задача 3.6 -  " + Block3.sum3(8,4,4));
        System.out.println("Задача 3.7 -  " + Block3.sum2(8,5));
        System.out.println("Задача 3.8 -  " + Block3.is35(30));
        System.out.println("Задача 3.9 -  " + Block3.magic6(1, 7));
        System.out.println("Задача 3.10 -  " + Block3.age(22));
        System.out.println("Задача 3.11 -  " + Block3.day(6));
        System.out.println("Задача 3.12");
        Block3.printDays("понедельник");
        System.out.println("Задача 4.1 -  " + Block4.listNums(6));
        System.out.println("Задача 4.2 -  " + Block4.reverseListNums(6));
        System.out.println("Задача 4.3 -  " + Block4.chet(6));
        System.out.println("Задача 4.4 -  " + Block4.pow(10,5));
        System.out.println("Задача 4.5 -  " + Block4.numLen(10));
        System.out.println("Задача 4.6 -  " + Block4.equalNum(1111));
        System.out.println("Задача 4.7");
        Block4.square(4);
        System.out.println("Задача 4.8");
        Block4.leftTriangle(4);
        System.out.println("Задача 4.9");
        Block4.rightTriangle(4);
        System.out.println("Задача 4.10");
        //Block4.guessGame();
        System.out.println("Задача 5.1 -  " + Block5.findFirst(new int[]{1, 2, 3, 4, 5},1));
        System.out.println("Задача 5.2 -  " + Block5.findLast(new int[]{1, 2, 3, 2, 5},2));
        System.out.println("Задача 5.3 -  " + Block5.maxAbs(new int[]{1, 2, 1, 3, -6, 5}));
        System.out.println("Задача 5.4 -  " + Block5.countPositive(new int[]{1, 2, 1, 3, -6, 5}));
        System.out.println("Задача 5.5 -  " + Block5.palindrom(new int[]{1, 3, 2, 2, 2,1}));
        System.out.println("Задача 5.6");
        Block5.reverse(new int[]{1, 2, 3,4,5});
        System.out.println();
        System.out.println("Задача 5.7");
        for (int i: Block5.reverseBack(new int[]{1, 2, 3,4,5})){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Задача 5.8");
        for (int i: Block5.concat(new int[]{1, 2, 3,4,5},new int[]{6,7,8})){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Задача 5.9");
        for (int i: Block5.findAll(new int[]{1, 2, 2,5,2}, 2)){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Задача 5.10");
        for (int i: Block5.deleteNegative(new int[]{1, -2, 2,-2,5})){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Задача 5.11");
        for (int i: Block5.add(new int[]{1, 2, 3,4,5},9,3)){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Задача 5.12");
        for (int i: Block5.add(new int[]{1, 2, 3,4,5},new int[]{7,8,9} ,3)){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача 1.1.1");
        Point p = new Point(4,5);
        Point p1 = new Point(2,1);
        Point p2 = new Point (3,4);
        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println();
        System.out.println("Задача 1.1.3 ");
        Name cleopatra1 = new Name("Клеопатра" , " 1" , "1");
        Name pushkin1 = new Name("Пушкин", "Александр", "Сергеевич");
        Name vladimir1 = new Name("Маяковский", "Владимир", " 1");
        System.out.println(cleopatra1);
        System.out.println(pushkin1);
        System.out.println(vladimir1);

        System.out.println();
        System.out.println("Задача 1.1.2 + Задача 1.2.2");

        Human cleopatra = new Human(cleopatra1, 152);
        Human pushkin = new Human(pushkin1, 167);
        Human vladimir = new Human(vladimir1, 189);
        System.out.println(cleopatra);
        System.out.println(pushkin);
        System.out.println(vladimir);

        System.out.println();
        System.out.println("Задача 1.1.4");
        Time t1 = new Time(10);
        Time t2 = new Time(10000);
        Time t3 = new Time(100000);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println();
        System.out.println("Задача 1.1.5");
        Home h1 = new Home(1);
        Home h2 = new Home(5);
        Home h3 = new Home(23);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        System.out.println();
        System.out.println("Задача 1.2.1");
        Point start1 = new Point(1,3);
        Point end1 = new Point(23,8);
        Point start2 = new Point(5,10);
        Point end2 = new Point(25,10);

        Line l1 = new Line(start1, end1 );
        Line l2 = new Line(start2, end2);
        Line l3 = new Line(start1, end2);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println("меняем координаты точки и все линии меняются");
        start1.x = 5;
        end1.y = 3;
        start2.y = 11;
        end2.y = 11;

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println("сознаем новую точку и меняем только в первой линии");

        Point start3 = new Point(1,1);
        //l1.a = start3;

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        System.out.println();
        System.out.println("Задача 1.2.3");


        Human ivan = new Human(new Name("Иван" ,"Чудов", "Иванович"),'м');
        Human peter = new Human(new Name("Петр" ,"Чудов", "Петрович"),'м');
    //    Human boris = new Human(new Name("Борис" ), 'м');
    //    Human maria = new Human(new Name("Мария" ), 'ж');
        //peter.father = ivan;
        //boris.father = peter;
        //maria.father = boris;
        System.out.println(ivan);
        System.out.println(peter);
        //System.out.println(boris);
       // System.out.println(maria);

        System.out.println();
        System.out.println("Задача 1.2.4");

        Department it = new Department(" IT");
        Employee petrov = new Employee(new Name ("Петров"), it);
        Employee kozlov = new Employee(new Name ("Козлов"), it);
        Employee sidorov = new Employee(new Name ("Сидоров"), it);
        //it.boss = kozlov;
        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);

        System.out.println("");
        System.out.println("Задача 1.3.1");
        Student vasia = new Student("vasia", new int[]{3,4,5});
        System.out.println(vasia);
        Student petia = new Student("petia");
        //petia.rates = vasia.rates;
        System.out.println(petia);
        //petia.rates[0] = 5;
        System.out.println(vasia);
        System.out.println(petia);
        //Student andrey = new Student("andrey",new int[3]);
        //for (int i = 0 ; i < vasia.rates.length; i ++){
        //    andrey.rates[i] = vasia.rates[i];
        //}
        System.out.println(vasia);
        //System.out.println(andrey);
        //vasia.rates[0] = 1;
        System.out.println(vasia);
        //System.out.println(andrey);


        System.out.println("");
        System.out.println("Задача 1.3.2");

        Point c1 = new Point(1,5);
        Point c2 = new Point(2,8);
        Point c3 = new Point(5,3);
        Curved cline1 = new Curved(new Point[]{c1,c2,c3});
        System.out.println(cline1);
        Point c4 = new Point(2,8);
        Point c5 = new Point(5,3);
        Curved cline2 = new Curved(new Point[]{c1,c4,c5,c3});
        System.out.println(cline2);
        c1.x = 2;
        System.out.println(cline1);
        System.out.println(cline2);

        System.out.println("");
        System.out.println("Задача 1.3.3");

        City a = new City("A");
        City b = new City("B");
        City c = new City("C");
        City d = new City("D");
        City e = new City("E");
        City f = new City("F");
        Route ab = new Route(b,5);
        Route af = new Route(f,1);
        Route ad = new Route(d,6);
        //a.routes.add(ab);
        //a.routes.add(af);
        //a.routes.add(ad);
        Route ba = new Route(a,5);
        Route bc = new Route(c,3);
        //b.routes.add(ba);
        //b.routes.add(bc);
        Route cb = new Route(b,3);
        Route cd = new Route(d,4);
        //c.routes.add(cb);
        //c.routes.add(cd);
        Route dc = new Route(c,4);
        Route de = new Route(e,2);
        Route da = new Route(a,6);
        //d.routes.add(dc);
        //d.routes.add(de);
        //d.routes.add(da);
        Route ef = new Route(f,2);
        //e.routes.add(ef);
        Route fb = new Route(b,4);
        Route fe = new Route(e,2);
        ///f.routes.add(fb);
        //f.routes.add(fe);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        System.out.println("");
        System.out.println("Задача 1.3.4");

        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);

        System.out.println("");
        System.out.println("Задача 1.4.1");
        Point np1 = new Point(3,5);
        Point np2 = new Point(25,6);
        Point np3 = new Point(7,8);
        System.out.println(np1);
        System.out.println(np2);
        System.out.println(np3);

        System.out.println("");
        System.out.println("Задача 1.4.2");
        Point np4 = new Point(1,3);
        Point np5 = new Point(23,8);
        Line nl1 = new Line(np4,np5);
        System.out.println(nl1);
        Point np6 = new Point(5,10);
        Point np7 = new Point(25,10);
        Line nl2 = new Line(np6,np7);
        System.out.println(nl2);
        Line nl3 = new Line(np4,np7);
        System.out.println(nl3);

        System.out.println("");
        System.out.println("Задача 1.4.3");
        Home nh1 = new Home(2);
        Home nh2 = new Home(35);
        Home nh3 = new Home(91);
        System.out.println(nh1);
        System.out.println(nh2);
        System.out.println(nh3);
        // нет возможности изменить количество этажей, снять комментарий со след строки.
        //nh1.levels = 18;

        System.out.println("");
        System.out.println("Задача 1.4.4");
        Time nt1 = new Time(10000);
        Time nt2 = new Time(2,3,5);
        System.out.println(nt1);
        System.out.println(nt2);

        System.out.println("");
        System.out.println("Задача 1.4.5");
        Name nn1 = new Name("Клеопатра");
        Name nn2 = new Name("Александр", "Пушкин" ,"Сергеевич");
        Name nn3 = new Name("Владимир" , "Маяковский");
        Name nn4 = new Name("Христофор" , "Бонифатьевич");
        System.out.println(nn1);
        System.out.println(nn2);
        System.out.println(nn3);
        System.out.println(nn4);

        System.out.println("");
        System.out.println("Задача 1.4.6");
        Human nh11 = new Human("Лев", 170);
        System.out.println(nh11);
        Name nn5 = new Name("Сергей","Пушкин");
        Human nh12 = new Human("Лев", 170);
        System.out.println(nn5);
        Human nh13 = new Human(nn5,168, nh12);
        System.out.println(nh13);
        // вот тут запутался совсем... надо пересобирать Human - слишком там много всего


        System.out.println("");
        System.out.println("Задача 1.4.7");
        Student nvasia = new Student("Вася",new int[]{3,4,5});
        Student max = new Student("Максим");
        System.out.println(nvasia);
        System.out.println(max);

        System.out.println("");
        System.out.println("Задача 1.5.1");
        Pistol pistol = new Pistol(3, 3);
        for(int i = 1; i<=5; i++){
            pistol.fire();
        }

        System.out.println("");
        System.out.println("Задача 1.5.2");
        Cat barsik = new Cat("Барсик");
        barsik.meow();
        barsik.meow(3);

        System.out.println("");
        System.out.println("Задача 1.5.3");
        Line line12 = new Line(new Point(1,1), new Point(10,15));
        line12.lenght();

        System.out.println("");
        System.out.println("Задача 1.5.4");
        Time time123 = new Time(34056);
        time123.whatTime("час");
        Time time124 = new Time(4532);
        time124.whatTime("минута");
        Time time125 = new Time(123);
        time125.whatTime("секунда");

        System.out.println("");
        System.out.println("Задача 1.5.5");
        Fraction f1 = new Fraction(1,3);
        System.out.println(f1);
        Fraction f2 = new Fraction(1,6);
        System.out.println(f2);
        System.out.println(f1.sum(f2));
        System.out.println(f1.sum(3));
        System.out.println(f1.minus(f2));
        System.out.println(f1.minus(3));
        System.out.println(f1.mul(f2));
        System.out.println(f1.mul(3));
        System.out.println(f1.sum(f2).mul(f2).minus(5));
        System.out.println(f1.div(f2));
        System.out.println(f1.div(3));

        System.out.println("");
        System.out.println("Задача 1.5.6");

        Student v = new Student("Вася", new int[]{3,4,5,4});
        Student v1 = new Student("Вася2");
        System.out.println(v.avg());
        System.out.println(v);
        System.out.println(v1.avg());
        System.out.println(v1);
        Student v3 = new Student("Петя", new int[]{5,5,5,5});
        System.out.println(v3.avg());
        System.out.println(v3.isFive());
        System.out.println(v3);

        System.out.println("");
        System.out.println("Задача 1.5.7");
        System.out.println(cline2);
        Point np157 = new Point(8,8);
        cline2.addPoints(np157);
        System.out.println(cline2);
        Point np158 = new Point(9,9);
        Point np159 = new Point(10,10);
        cline2.addPointsArray(new Point[]{np158,np159});
        System.out.println(cline2);
        Point np160 = new Point(11,11);
        Point np161 = new Point(12,12);
        cline2.addPoints(np160,np161);
        System.out.println(cline2);
        System.out.println(cline2.lenght());
        Point np162 = new Point(1,5);
        Point np163 = new Point(2,8);
        Point np164 = new Point(5,3);
        Curved cline44 = new Curved();
        cline44.addPoints(np162,np163,np164);
        System.out.println(cline44.lenght());
        Point np165 = new Point(5,15);
        Point np166 = new Point(8,10);
        cline44.addPoints(np165,np166);
        System.out.println(cline44.lenght());

        System.out.println("");
        System.out.println("Задача 1.5.8");
        Point np167 = new Point(5,3);
        Square sq = new Square(np167,23);
        System.out.println(sq);
        Curved cline45 = sq.createCurved();
        System.out.println(cline45);
        System.out.println(cline45.lenght());
        Point np168 = new Point(15,25);
        cline45.points.set(3,np168);
        System.out.println(cline45);
        System.out.println(cline45.lenght());


        System.out.println("");
        System.out.println("Задача 1.6.1");
        Home nh161 = new Home(3);
        System.out.println(nh161);
        Home nh162 = new Home(1);
        System.out.println(nh161);

        System.out.println("");
        System.out.println("Задача 1.6.2");
        Time t162 = new Time(87220);
        System.out.println(t162);

        System.out.println("");
        System.out.println("Задача 1.6.3");
        Square sq163 = new Square(new Point(1,1),5);
        System.out.println(sq163);
        System.out.println(sq163.getSide());
        //sq163.setSide(-5);
        //Square sq164 = new Square(new Point(1,1),-5);

        System.out.println("");
        System.out.println("Задача 1.6.4");
       // Fraction f164 = new Fraction(1,-22);
       // System.out.println(f164);
        // System.out.println(f164.getDown());

        System.out.println("");
        System.out.println("Задача 1.6.5");
        Pistol pistol165 = new Pistol(5,5);
        System.out.println(pistol165.getMaxBullets());
        System.out.println(pistol165.getBullets());
        pistol165.fire();
        System.out.println(pistol165.getBullets());
        pistol165.fire();
        System.out.println(pistol165.getBullets());
        pistol165.reload(12);
        System.out.println(pistol165.getBullets());
        System.out.println(pistol165.unload());
        System.out.println(pistol165.getBullets());
        System.out.println(pistol165.ready());
        pistol165.reload(12);
        System.out.println(pistol165.ready());
        Pistol pistol166 = new Pistol(7,3);
        for(int i = 1; i<=5; i++){
            pistol166.fire();
        }
        pistol166.reload(8);
        pistol166.fire();
        pistol166.fire();
        System.out.println(pistol166.unload());
        pistol166.fire();

        System.out.println("");
        System.out.println("Задача 1.6.6");
        Point p166 = new Point(1,1);
        Point p167 = new Point(2,2);
        Point p168 = new Point(3,3);
        Line l166 = new Line(p166,p167);
        Line l167 = new Line(p167,p168);
        System.out.println(l166);
        System.out.println(l167);
        Point p169 = new Point(4,4);
        l166.setB(p169);
        System.out.println(l166);
        System.out.println(l167);

        System.out.println("");
        System.out.println("Задача 1.6.7");
        Name name167 = new Name("1");
        name167.setName("ddd");
        System.out.println(name167);

        System.out.println("");
        System.out.println("Задача 1.6.10");
        City c1610 = new City("A");
        City c1611 = new City("B");
        City c1612 = new City("C");
        City c1613 = new City("D");
        Route r1610 = new Route(c1610,1);
        Route r1611 = new Route(c1611,2);
        Route r1612 = new Route(c1612,3);
        ArrayList<Route> newRoute = new ArrayList<>();
        newRoute.add(r1610);
        newRoute.add(r1611);
        newRoute.add(r1612);
        c1610.addRoute(newRoute);
        System.out.println(c1610);
        Route r1613 = new Route(c1612,5);
        Route r1614 = new Route(c1613,5);
        ArrayList<Route> newRoute2 = new ArrayList<>();
        newRoute2.add(r1613);
        newRoute2.add(r1614);
        c1610.addRoute(newRoute2);
        System.out.println(c1610);


        System.out.println("");
        System.out.println("Задача 1.6.11");
        Department IT2 = new Department("IT2");
        Department IT3 = new Department("IT3");
        Name new1611 = new Name("Ivanov");
        Name new1612 = new Name("Petrov");
        Employee em1 = new Employee(new1611,IT2);
        Employee em2 = new Employee(new1612,IT2);
        ArrayList<Employee> nar = new ArrayList<>();
        nar.add(em2);
        IT2.setStaff(nar);
        System.out.println(IT2);
        System.out.println(em1);
        IT2.setBoss(em1);
        System.out.println(IT2);
        System.out.println(em1);
        em1.setDept(IT3);
        System.out.println(IT2);
        System.out.println(IT3);
        System.out.println(em1);

        System.out.println("");
        System.out.println("Задача 3.1.2");
        Point np312 = new Point(1,1);
        Point np313 = new Point(2,2);
        Point np314 = new Point(3,3);
        ArrayList newPoints12 = new ArrayList<>();
        newPoints12.add(np312);
        CurvedCircled cc = new CurvedCircled(newPoints12);

        cc.addPoints(np312,np313,np314);
        System.out.println(cc);

        System.out.println("");
        System.out.println("Задача 3.1.2");
        CityWithBackRoad nc312 = new CityWithBackRoad("A");
        CityWithBackRoad nc313 = new CityWithBackRoad("B");
        CityWithBackRoad nc314 = new CityWithBackRoad("C");
        Route nr315 = new Route(nc313,2);
        Route nr316 = new Route(nc314,3);
        ArrayList newRoutesForA = new ArrayList<>();
        newRoutesForA.add(nr315);
        newRoutesForA.add(nr316);
        nc312.addRoute(newRoutesForA);
        System.out.println(nc312);
        System.out.println(nc313);
        System.out.println(nc314);


        System.out.println("");
        System.out.println("Задача 3.1.5");
        Point3D np315 = new Point3D(1,2,3);
        System.out.println(np315);

        System.out.println("");
        System.out.println("Задача 3.2.3");
        Sparrow sparrow = new Sparrow();
        System.out.println(sparrow.Sing());
        Cuckoo cuckoo = new Cuckoo();
        System.out.println(cuckoo.Sing());
        Parrot parrot = new Parrot("Пиастры Пиастры");
        System.out.println(parrot.Sing());

        System.out.println("");
        System.out.println("Задача 3.2.4");
        Point p324 = new Point(1,1);
        Point p325 = new Point(4,4);
        Point p326 = new Point(5,0);
        Triangle triangle = new Triangle(p324,p325,p326);
        System.out.println(triangle.square());

        System.out.println("");
        System.out.println("Задача 3.2.5");
        Attribute atr1 = new Attribute("x", 3);
        Attribute atr2 = new Attribute("color", "red");
        List<Attribute> list;
        list =  new ArrayList<>();
        list.add(atr1);
        list.add(atr2);
        Points points = new Points(list);
        System.out.println(points.getAttribute("color"));
        Attribute atr3 = new Attribute("x", 4);
        Attribute atr4 = new Attribute("y", 2);
        Attribute atr5 = new Attribute("z", 5);
        Attribute atr6 = new Attribute("time", "11:00");
        List<Attribute> list2;
        list2 =  new ArrayList<>();
        list2.add(atr3);
        list2.add(atr4);
        list2.add(atr5);
        list2.add(atr6);
        Points points2 = new Points(list2);
        System.out.println(points2.getAttribute("time"));

        System.out.println("");
        System.out.println("Задача 3.3.1");
        System.out.println(Methods.added(2, new Fraction(3,5), 2.3));
        System.out.println(Methods.added(3.6, new Fraction(49,12),3, new Fraction(3,2)));
        System.out.println(Methods.added( new Fraction(1,3), 1));


        System.out.println("");
        System.out.println("Задача 3.3.2");
        Methods.singer(cuckoo,sparrow,parrot);


        System.out.println("");
        System.out.println("Задача 3.3.3");
        System.out.println(Methods.allArea(triangle,sq,triangle));

        System.out.println("");
        System.out.println("Задача 3.3.4");
        Methods.allMeow(barsik);


        System.out.println("");
        System.out.println("Задача 3.3.5");
        System.out.println(Methods.allLen(triangle, sq));


        System.out.println("");
        System.out.println("Задача 3.3.9");

        Methods.cities();









    }

}