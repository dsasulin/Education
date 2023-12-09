package org.example;

public class Block3 {
    /*Задача 3.1*/

    public static int abs(int x){
        int res;
        if (x<0){
            res=x * -1;
        } else{
            res = x;
        }
        return res;
    }

    /*Задача 3.2*/

    public static int safeDiv(int x, int y){
        int res = 0;
        if (y==0){
            res = 0;
        }else {
            res = x/y;
        }
        return res;
    }

    /*Задача 3.3*/

    public static int max(int x, int y){
        return x>y?x:y;
    }

    /*Задача 3.4*/

    public static String makeDecision(int x, int y){
        String res;
        res ="";
        if (x == y) { res = x+ "==" + y; };
        if ( x> y) { res = x+ ">" + y; }
        if (x < y) { res = x+ "<" + y; }
        return res;
    }

    /*Задача 3.5*/

    public static int max3(int x, int y, int z){
        int max;
        max = x;
        if (y > max) { max = y;};
        if (z > max) { max = z;};
        return max;
    }

    /*Задача 3.6*/
    public static boolean sum3(int x, int y, int z){
        boolean res;
        res = false;
        if (x + y == z) { res = true;};
        if (y + z == x) { res = true;};
        if (x + z == y) { res = true;};

        return res;
    }

    /*Задача 3.7*/

    public static int sum2(int x, int y){
        int res;
        res = x;
        if (x + y > 10 && x + y < 19) { res = 20;}
        else { res = x + y; };
        return res;
    }

    /*Задача 3.8*/

    public static boolean is35(int x){
        boolean res;
        res = false;
        if (x%3 == 0 && x%5 == 0) {
            res = false;
        }else if (x%3 == 0 || x%5 == 0) {
            res = true;
        }
        return res;

    }

    /*Задача 3.9*/

    public static boolean magic6(int x, int y) {
        boolean res;
        res = false;
        if (x == 6 || y == 6 ) { res = true;}
        else if (x + y == 6 ) { res = true;}
        else if (x - y == 6 ) { res = true;}
        else if (y - x == 6 ) { res = true;}
        return res;

    }

    /*Задача 3.10*/
    public static String age(int x){
        String res;
        res = x + " ";

        if  (x % 10 == 1 && x != 11) {
            res = res + "год";
        }else if ((x%10 == 2 || x%10 == 3 ||  x%10 == 4) && (x != 12 && x != 13 && x != 14) ){
            res = res + "года";
        }else {
            res = res + " лет";
        }
        return res;

    }

    /*Задача 3.11*/

    public static String day(int x){
        String res;
        res = "это не день недели";
        switch (x) {
            case 1:
                res = "понедельник";
                break;
            case 2:
                res = "вторник";
                break;
            case 3:
                res = "среда";
                break;
            case 4:
                res = "четверг";
                break;
            case 5:
                res = "пятница";
                break;
            case 6:
                res = "суббота";
                break;
            case 7:
                res = "воскресенье";
                break;
        }
        return res;

    }

    /*Задача 3.12*/

    public static void printDays(String x){
        String res = "";
        switch (x) {
            case "понедельник":
                res = "понедельник";
            case "вторник":
                res = res + " вторник ";
            case "среда":
                res = res +" среда ";
            case "четверг":
                res = res + " четверг ";
            case "пятница":
                res = res + " пятница ";
            case "суббота":
                res = res + " суббота ";
            case "воскресенье":
                res = res + " воскресенье ";
                break;
            default:
                res = "это не день недели";
        }
        System.out.println(res);
    }
}
