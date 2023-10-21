package oop.dedicnost.priklad3;

import org.w3c.dom.ls.LSOutput;

public class Clovek extends SuperClovek {
  // Atributy triedy
    protected int vyska;
    protected double hmotnost;
    protected int vek;

    public Clovek(int vyska, double hmotnost, int vek) {
        this.vyska = vyska;
        this.hmotnost = hmotnost;
        this.vek = vek;
    }

    public void bezi (){
        // Tu mohla byt zmysluplnejsia implementacia tejto metody
        System.out.println("Beží");
    }
        public void kraca(){
            System.out.println("Kráča");
        }
        public void skace (){
            System.out.println("Skáče");
    }
    public void vypisVyska() {
        System.out.println(vyska);
    }
    public void vypisHmotnost() {
        System.out.println(hmotnost);
    }
}
