package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        ArrayList nums = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            nums.add(sc.nextInt());
        }
        int num2;
        Scanner sc2 = new Scanner(System.in);
        num2 = sc2.nextInt();
        ArrayList nums2 = new ArrayList<>();
        for (int i = 0; i < num2; i++) {
            nums2.add(sc2.nextInt());
        }

    }
}