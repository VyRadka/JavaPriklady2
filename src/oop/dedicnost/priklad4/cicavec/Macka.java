package oop.dedicnost.priklad4.cicavec;


public class Macka extends Cicavec{
    public Macka(String farba, String rasa, String druh, double dozitie, double vaha ){super(farba,rasa,druh,dozitie,vaha);};

    @Override
    public void prejavSa() {
        System.out.println("mačka mňauká");
    }

    public static void main(String[] args) {
        Macka mojaMacka = new Macka("čierna", "Perská", "domáca", 15, 5.6);
        System.out.println("Mačka má farbu: " + mojaMacka.farba);
        System.out.println("Rasa mačky je: " + mojaMacka.rasa);
        System.out.println("Druh mačky: " + mojaMacka.druh);
        System.out.println("Mačka sa dožije: " + mojaMacka.dozitie);
        System.out.println("Váha mačky je: "+ mojaMacka.vaha + "kg");


        System.out.println();

        mojaMacka.kdeZvieraZije();
        System.out.println("Mačka žije v domácnosti aj vo voľnej prírode");
        mojaMacka.vztahKcloveku();
        System.out.println("Mačka žije v simbioze s človekom.");
    }

}
