package oop.enkapsulacia;

import java.util.ArrayList;

public class ZoznamKnihSpravneEfektivneVypisanieKonstruktory {
    public static void main(String[] args) {
        KnihaSpravne kniha1 = new KnihaSpravne("Java", "Radka Vyšňanová", 2000, 3.99); // Vytvorili sme objekt (Instanciu triedy) kniha


        System.out.println("Vypíš detail knihy číslo 1: ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Názov knihy: " + kniha1.getNazov());
        System.out.println("Autor knihy: " + kniha1.getAutor());
        System.out.println("Cena knihy: "  + kniha1.getCena());
        System.out.println("Rok vydania: " + kniha1.getRokVydania());

        KnihaSpravne kniha2 = new KnihaSpravne("Já, robot", "Isaac Asimov", 1968, 2.99);

        System.out.println();
        System.out.println("Vypíš detail knihy číslo 2:");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Názov knihy: " + kniha2.getNazov());
        System.out.println("Autor knihy: " + kniha2.getAutor());

        // knihy vložíme do ArrayList-u
        ArrayList<KnihaSpravne> knihy = new ArrayList<>();
        knihy.add(kniha1);
        knihy.add(kniha2);
// ako vypísať obsah knihy
        for (KnihaSpravne knihaObjekt:knihy){
            //System.out.println(knihaObjekt); > vypíše nezrozumitelny text

            System.out.println("---------------------------------------------------------------");
   /*         System.out.println("Názov knihy:" + knihaObjekt.getNazov());
            System.out.println("Augor knihy: "+ knihaObjekt.getAutor());
            System.out.println("Cena knihy: " + knihaObjekt.getCena());
            System.out.println("Rok vydania knihy: " + knihaObjekt.getRokVydania());*/

            System.out.println(knihaObjekt);
        }
    }
}
