package org.example;

public class Pistol {
    private int bullets;

    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    Pistol(){
        this(5);
    }
    Pistol(int bullets){
        this.bullets = bullets;
    }

    public void fire(){
        if (this.getBullets() > 0) {
            System.out.println("Бах!");
            this.setBullets(this.getBullets()-1);
        }else {
            System.out.println("Клац!");
        }
    }
}
