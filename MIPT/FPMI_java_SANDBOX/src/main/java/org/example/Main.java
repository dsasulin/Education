package org.example;


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
        Name cleopatra1 = new Name("Клеопатра");
        Name pushkin1 = new Name("Пушкин", "Александр", "Сергеевич");
        Name vladimir1 = new Name("Маяковский", "Владимир");
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
        l1.a = start3;

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        System.out.println();
        System.out.println("Задача 1.2.3");


        Human ivan = new Human(new Name("Иван" ,"Чудов"),'м');
        Human peter = new Human(new Name("Петр" ,"Чудов"),'м');
        Human boris = new Human(new Name("Борис" ), 'м');
        Human maria = new Human(new Name("Мария" ), 'ж');
        peter.father = ivan;
        boris.father = peter;
        maria.father = boris;
        System.out.println(ivan);
        System.out.println(peter);
        System.out.println(boris);
        System.out.println(maria);

        System.out.println();
        System.out.println("Задача 1.2.4");

        Department it = new Department(" IT");
        Employee petrov = new Employee(new Name ("Петров"), it);
        Employee kozlov = new Employee(new Name ("Козлов"), it);
        Employee sidorov = new Employee(new Name ("Сидоров"), it);
        it.boss = kozlov;
        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);

        System.out.println("");
        System.out.println("Задача 1.3.1");
        Student vasia = new Student("vasia", new int[]{3,4,5});
        System.out.println(vasia);
        Student petia = new Student("petia");
        petia.rates = vasia.rates;
        System.out.println(petia);
        petia.rates[0] = 5;
        System.out.println(vasia);
        System.out.println(petia);
        Student andrey = new Student("andrey",new int[3]);
        for (int i = 0 ; i < vasia.rates.length; i ++){
            andrey.rates[i] = vasia.rates[i];
        }
        System.out.println(vasia);
        System.out.println(andrey);
        vasia.rates[0] = 1;
        System.out.println(vasia);
        System.out.println(andrey);


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
        a.routes.add(ab);
        a.routes.add(af);
        a.routes.add(ad);
        Route ba = new Route(a,5);
        Route bc = new Route(c,3);
        b.routes.add(ba);
        b.routes.add(bc);
        Route cb = new Route(b,3);
        Route cd = new Route(d,4);
        c.routes.add(cb);
        c.routes.add(cd);
        Route dc = new Route(c,4);
        Route de = new Route(e,2);
        Route da = new Route(a,6);
        d.routes.add(dc);
        d.routes.add(de);
        d.routes.add(da);
        Route ef = new Route(f,2);
        e.routes.add(ef);
        Route fb = new Route(b,4);
        Route fe = new Route(e,2);
        f.routes.add(fb);
        f.routes.add(fe);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        System.out.println("");
        System.out.println("Задача 1.3.4");
        it.staff.add(petrov);
        it.staff.add(kozlov);
        it.staff.add(sidorov);
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
    }




}