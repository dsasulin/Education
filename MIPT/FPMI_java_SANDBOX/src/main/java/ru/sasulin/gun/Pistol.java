package ru.sasulin.gun;

public class Pistol {
    private int bullets;
    private final int maxBullets;

    public int getMaxBullets() {
        return this.maxBullets;
    }

    public int getBullets() {
        return this.bullets;
    }

    public void setBullets(int bullets) {
        if (bullets > this.maxBullets){
            this.bullets = this.maxBullets;
            int rest = bullets - this.maxBullets;
            System.out.println("Передано больше чем максимальная вместимость равная " + this.maxBullets + ",  остаток " + rest + " возвращен");
        }else {
            this.bullets = bullets;
        }
    }

    public Pistol(int maxBullets, int bullets){
        this.maxBullets = maxBullets;
        if (this.bullets > this.maxBullets){
            throw new IllegalArgumentException();
        }
        this.bullets = bullets;
    }

    public void reload(int addBullets){
        if (addBullets < 0 ) {
            throw new IllegalArgumentException("Количество патронов не может быть отрицательным");
        }
        this.setBullets(addBullets);
    }
    public String unload(){
        String res = "Возвращено: " + this.bullets + " патронов";
        this.setBullets(0);
        return res;
    }

    public boolean ready(){
        boolean res = false;
        res = this.bullets > 0;
        return res;
    }

    public void fire(){
        if (this.getBullets() > 0) {
            System.out.println("Бах!");
            this.setBullets(this.getBullets() - 1);
        }else {
            System.out.println("Клац!");
        }
    }
}
