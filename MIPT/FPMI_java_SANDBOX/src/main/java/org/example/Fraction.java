package org.example;


public class Fraction {
    private int top,down;

    Fraction(int top, int down){
        this.top = top;
        this.down = down;
    }
    public Fraction sum(Fraction f2){
        Fraction res = null;
        int resx,resy;
        resx = this.top * f2.down + f2.top * this.down;
        resy = this.down * f2.down;
        if(resy % resx == 0) {
            resy = resy / resx;
            resx = resx / resx;
        }
        res = new Fraction(resx, resy);
        return res;

    }
    public Fraction sum(int i){
        return this.sum(new Fraction(i,1));
    }
    public Fraction minus(Fraction f2){
        Fraction res = null;
        int resx,resy;
        resx = this.top * f2.down - f2.top * this.down;
        resy = this.down * f2.down;
        if(resy % resx == 0) {
            resy = resy / resx;
            resx = resx / resx;
        }
        res = new Fraction(resx, resy);
        return res;
    }
    public Fraction minus(int i){
        return this.minus(new Fraction(i,1));
    }
    public Fraction mul(Fraction f2){
        Fraction res = null;
        int resx,resy;
        resx = this.top *  f2.top;
        resy = this.down * f2.down;
        if(resy % resx == 0) {
            resy = resy / resx;
            resx = resx / resx;
        }
        res = new Fraction(resx, resy);
        return res;
    }
    public Fraction mul(int i){
        return this.mul(new Fraction(i,1));
    }

    public Fraction div(Fraction f2){
        Fraction res = null;
        int resx,resy;
        resx = this.top *  f2.down;
        resy = this.down * f2.top;
        if(resy % resx == 0) {
            resy = resy / resx;
            resx = resx / resx;
        }
        if(resx % resy == 0) {
            resx = resx / resy;
            resy = resy / resy;
        }
        res = new Fraction(resx, resy);
        return res;
    }
    public Fraction div(int i){
        return this.div(new Fraction(i,1));
    }

    public String toString(){
        String res;
        res = top +"/" +down;
        return res;
    }
}
