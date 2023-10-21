package oop.dedicnost.priklad3;

public class Sportovec extends Clovek{


    public Sportovec(int vyska, double hmotnost, int vek) {
        super(vyska, hmotnost, vek);
    }

    public void maKondicku(){
        System.out.println("Má kondičku.");
    }
    public void trenuje(){
        System.out.println("Trénuje pravidelne.");
    }

}
