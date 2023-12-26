package ru.sasulin.home;

public class Home {

    private final int levels;

    public int getLevels() {
        return levels;
    }

    public Home(int levels){
        if (levels < 0) {
            throw new IllegalArgumentException();
        }
        this.levels = levels;
    }

     private static String levels(int x){
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
