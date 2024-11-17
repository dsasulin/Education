package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer number ;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        ArrayList nums = new ArrayList<>();
        for (int i = 0; i<number;i++){
            nums.add(sc.nextInt());
        }
        Integer j;
        Integer t;
        for (int i = 0; i < number; i++){
            for (j = i+1; j < number; j++){
                if ((Integer)nums.get(j) < (Integer) nums.get(i)) {
                    t = (Integer) nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, t);
                }
            }
        }
        for (int i = 0; i< number; i++){
            System.out.println(nums.get(i));
        }

    }
}