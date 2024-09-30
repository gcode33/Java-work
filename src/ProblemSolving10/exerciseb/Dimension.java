package ProblemSolving10.exerciseb;

import java.util.Arrays;

public class Dimension {
    private int len;
    private int wdt;
    private int hgt;


    public  Dimension(int len, int wdt, int hgt){
        setlen(len);
        setwdt(wdt);
        sethgt(hgt);

    }

    public void setlen(int len) {
        this.len = len;
    }

    public void sethgt(int hgt) {
        this.hgt = hgt;
    }

    public void setwdt(int wdt) {
        this.wdt = wdt;
    }

    public int getHgt() {
        return hgt;
    }

    public int getLen() {
        return len;
    }

    public int getWdt() {
        return wdt;
    }
    @Override
    public String toString() {
        return "Length: " + getLen() + "  height: " + getHgt() + "  weight: " +
                getWdt();
    }
}
