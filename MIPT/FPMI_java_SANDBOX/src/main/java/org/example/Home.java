package org.example;

public class Home {

    final int levels;

    Home(int levels){

        this.levels = levels;
    }

    public static String levels(int x){
        String res;
        res = x + " ";
        // добавлено условие < 100 чтобы было корректно 111 этажами и 211 этажами
        if  (x % 10 == 1 && x != 11 && x < 100) {
            res = res + "этажем";
        }else {
            res = res + "этажами";
        }
        return res;
    }

    @Override
    public String toString() {
        return "дом с " + levels(this.levels);
    }
}
