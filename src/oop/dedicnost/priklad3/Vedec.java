package oop.dedicnost.priklad3;

public class Vedec extends Clovek {
    public Vedec(int vyska, double hmotnost, int vek) {
        super(vyska, hmotnost, vek);
    }

    public void skuma(){
        System.out.println("Skúma");
    }
    public void objavuje(){
        System.out.println("Objavuje");
    }
}
