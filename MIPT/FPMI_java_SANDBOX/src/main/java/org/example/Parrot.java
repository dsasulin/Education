package org.example;

import java.util.Random;

public class Parrot extends Bird{

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    Parrot(String text) {
        this.text = text;
    }
    @Override
    String Sing() {
        String res;
        Random r = new Random();
        int len = this.text.length();
        int x = r.nextInt(1,len);
        res = this.text.substring(0,x);
        return res;
    }
}
