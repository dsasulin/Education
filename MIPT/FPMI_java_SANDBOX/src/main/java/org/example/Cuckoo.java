package org.example;

import java.util.Random;

public class Cuckoo extends Bird{
    @Override
    String Sing() {
        String res;
        res = "ку-ку ";
        Random r = new Random();
        int x = r.nextInt(1,10);
        for (int i = 0 ; i < x; i++){
            res = res + "ку-ку ";
        }
        return res;
    }
}
