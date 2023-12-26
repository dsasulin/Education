package ru.sasulin.blocks;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Block5 {

    /*Задача 5.1*/

    public static int findFirst(int[] arr, int x){
        int res;
        res = 0;
        for (int i =0; i< arr.length; i++){
            if (arr[i] == x) {
                res = i;
                break;
            }
        }
        return res;
    }

    /*Задача 5.2*/

    public static int findLast(int[] arr, int x){
        int res;
        res = 0;
        for (int i =arr.length-1 ; i>=0 ; i--){
            if (arr[i] == x) {
                res = i;
                break;
            }
        }
        return res;
    }

    /*Задача 5.3*/

    public static int maxAbs(int[] arr){
        int res;
        res = arr[0];
        for (int i =0 ; i < arr.length ; i++){
            if (Math.abs(arr[i]) > Math.abs(res)) {
                res = arr[i];
            }
        }
        return res;
    }

    /*Задача 5.4*/

    public static int countPositive(int[] arr){
        int res;
        res = 0;
        for (int i =0 ; i < arr.length ; i++){
            if (arr[i] > 0 ) {
                res++;
            }
        }
        return res;
    }

    /*Задача 5.5*/

    public static boolean palindrom(int[] arr){
        boolean res;
        res = false;
        for (int i =0 ; i < arr.length/2 ; i++){
            if (arr[i] == arr[arr.length-1-i] ) {
                res = true;
            }else {
                res = false;
                break;
            }
        }
        return res;
    }

    /*Задача 5.6*/

    public static void reverse(int[] arr){
        int tmp;
        for (int i =0 ; i < arr.length/2 ; i++){
            tmp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = tmp;
            }
        for (int i =0 ; i < arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }

    /*Задача 5.7*/

    public static int[] reverseBack(int[] arr){
        int[] x;
        int tmp;
        x = arr;
        for (int i =0 ; i < arr.length/2 ; i++){
            tmp = arr[i];
            arr[i] = arr[arr.length-1-i];
            x[arr.length-1-i] = tmp;
        }
        return x;
    }

    /*Задача 5.8*/

    public static int[] concat(int[] arr1, int[] arr2){
        int[] res = Arrays.copyOf(arr1, arr1.length + arr2.length);
        System.arraycopy(arr2, 0, res, arr1.length, arr2.length);

        return res;

    }

    /*Задача 5.9*/

    public static int[] findAll(int[] arr, int x){
        int pos = 0;
        int count = 0;
        for (int i = 0; i<arr.length;i++){
            if (arr[i] == x) {
                count++;
            }
        }
        int res[] = new int[count];

        for (int i = 0; i<arr.length;i++){
            if (arr[i] == x) {
                res[pos] = i;
                pos++;
            }
        }
        return res;

    }

    /*Задача 5.10*/

    public static int[] deleteNegative(int[] arr){
        int pos = 0;
        int count = 0;
        for (int i = 0; i<arr.length;i++){
            if (arr[i] >0) {
                count++;
            }
        }
        int res[] = new int[count];

        for (int i = 0; i<arr.length;i++){
            if (arr[i] > 0 ) {
                res[pos] = arr[i];
                pos++;
            }
        }
        return res;
    }

    /*Задача 5.11*/

    public static int[] add(int[] arr, int x, int pos){
        int[] res = new int[arr.length+1];
        res[pos] = x;
        for (int i = 0 ; i < pos; i++){
            res[i] = arr[i];
        }
        for (int j = pos+1 ; j < res.length; j++){
            res[j] = arr[j-1];
        }

        return res;
    }

    /*Задача 5.12*/

    public static int[] add(int[] arr, int[] ins, int pos){
        int[] res = new int[arr.length+ins.length];
        for (int i = 0 ; i < pos; i++){
            res[i] = arr[i];
        }
        for (int j = 0; j < ins.length; j++) {
            res[pos + j] = ins[j];
        }
        for (int k = pos+ins.length; k < res.length ; k++ ){
            res[k] = arr[k-3];
        }

        return res;
    }

}
