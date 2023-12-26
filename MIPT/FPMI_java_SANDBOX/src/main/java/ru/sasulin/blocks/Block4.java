package ru.sasulin.blocks;

public class Block4 {

    /*Задача 4.1*/

    public static String listNums(int x){
        String res ;
        res = "0 ";

        for (int i=1; i<=x ;i++) {
            res = res + i +" ";
        }
        return res;
    }

    /*Задача 4.2*/

    public static String reverseListNums(int x){
        String res;
        res = "";
        for (int i=x; i>=0 ;i--) {
            res = res + i +" ";
        }

        return res;

    }

    /*Задача 4.3*/

    public static String chet(int x){
        String res;
        res = "0 ";

        for (int i=2; i<=x ;i=i+2) {
            res = res + i +" ";
        }

        return res;
    }

    /*Задача 4.4*/

    public static int pow(int x, int y){
        int res;
        res = 1*x;
        for (int i=2; i<=y ; i++) {
            res = res*x;
        }

        return res;

    }

    /*Задача 4.5*/

    public static int numLen(long x){
        int res;
        res = 0;
        while (x>0) {
            x = x/10;
            res++;
        }

        return res;
    }

    /*Задача 4.6*/

    public static boolean equalNum(int x){
        boolean res;
        res = false;
        int y = x % 10;
        while (x > 0){
            if (x % 10 == y ) {
                res = true;
            }else {
                res = false;
                break;
            }
            x = x / 10;
        }
        return res;
    }

    /*Задача 4.7*/

    public static void square(int x){
        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /*Задача 4.8*/
    public static void leftTriangle(int x){
        for (int i = 0; i < x; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /*Задача 4.9*/

    public static void rightTriangle(int x){

        for (int i = 0; i <= x; i++){
            for (int j = 0; j< x-i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /*Задача 4.10*/

    public static void guessGame() {
        int randomNum = 3;
        int count = 0 ;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What number am I thinking (0 to 9)? :");
        int x = sc.nextInt();
        while (true){
            count ++;
            if (x == randomNum) {
                System.out.println("Yes, it`s " + randomNum + " tried " + count + " times");
                break;
            }
            System.out.println("No, try again");
            System.out.println("What number am I thinking (0 to 9)? :");
            x = sc.nextInt();
        }

    }
}
