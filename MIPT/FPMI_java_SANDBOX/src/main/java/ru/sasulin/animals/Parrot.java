package ru.sasulin.animals;

import java.util.Random;

public class Parrot extends Bird{

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Parrot(String text) {
        this.text = text;
    }
    @Override
    public String Sing() {
        String res;
        Random r = new Random();
        int len = this.text.length();
        int x = r.nextInt(1,len);
        res = this.text.substring(0,x);
        return res;
    }
}
