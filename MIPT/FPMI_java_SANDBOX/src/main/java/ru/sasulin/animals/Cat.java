package ru.sasulin.animals;

public class Cat implements Meoweble{
    private String name;

    public Cat(String name){
        this.name = name;
    }

     public void meow(){
        this.meow(1);
     }
    public void meow(int count){
        String res;
        res = name +":";
        for (int i = 0; i < count; i++){
            if (count > 1 && i > 0){
                res = res + "-мяу";
            }else {
                res = res + " мяу";
            }
        }
        System.out.println(res + "!");
    }

    public String toString(){
        String res;
        res = "кот: " + name;
        return res;
    }

}
