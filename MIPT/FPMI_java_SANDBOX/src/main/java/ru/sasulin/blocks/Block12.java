package ru.sasulin.blocks;

public class Block12 {

    /*Задача 2.1*/
    public static double fraction(double x) {
        int dpart = (int)x;
        return x-dpart;
    }

    /*Задача 2.2*/
    public static int sumLastNums(int x) {
        int res;
        res = x%10 + x/10%10;
        return res;
    }
    /*Задача 2.3*/

    public static int charToNum(char x){
        int i;
        i = (int) x;
        return i;
    }
    /*Задача 2.4*/
    public static boolean isPositive(int x){
        boolean y;
        y =(boolean)(x>=0);
        return y;
    }

    /*Задача 2.5*/

    public static boolean is2Digits(int x){
        boolean y;
        y = (boolean) (x>9 && x<100 || x<-9 && x>-100);
        return y;
    }

    /*Задача 2.6*/

    public static boolean isUpperCase(char x){
        boolean y;
        y = (boolean)((int)x >= (int)'A' && (int)x<=(int)'Z');
        return y;
    }

    /*Задача 2.7*/

    public static boolean isInRange(int a, int b, int num){
        boolean y;
        y = (boolean) ((a>b) && (num>=b && num <=a))||((a<b) && (num<=b && num >=a));
        return y;
    }

    /*Задача 2.8*/

    public static boolean isDivisor (int a, int b){
        boolean y;
        y = (boolean)(a%b == 0 || b%a==0);
        return y;

    }

    /*Задача 2.9*/

    public static boolean isEqual (int a, int b, int c){
        boolean y;
        y=(boolean)(a==b && a ==c );
        return y;
    }

    /*Задача 2.10*/

    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }
}
