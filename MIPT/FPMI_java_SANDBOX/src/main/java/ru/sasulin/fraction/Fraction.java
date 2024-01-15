package ru.sasulin.fraction;


import java.util.Objects;

final public class Fraction extends Number implements Cloneable{
    private final int top,down;

    public int getTop() {
        return this.top;
    }

    public int getDown() {
        return this.down;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return top == fraction.top && down == fraction.down;
    }

    @Override
    public int hashCode() {
        return Objects.hash(top, down);
    }

    @Override
    public Fraction clone() {
        try {
            return (Fraction)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Fraction(int top, int down){
        this.top = top;
        if (down < 0 ){
            throw new IllegalArgumentException();
        }
        this.down = down;
    }
    Fraction(int top){
        this(top, 1);
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

    @Override
    public int intValue() {
        return this.top/this.down;
    }

    @Override
    public long longValue() {
        return this.top/this.down;
    }

    @Override
    public float floatValue() {
        return (float)(this.top)/this.down;
    }

    @Override
    public double doubleValue() {
        return (double)(this.top)/this.down;
    }



}
