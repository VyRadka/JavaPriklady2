package oop.enkapsulacia;

import java.util.ArrayList;

public class ZoznamKnih {
    public static void main(String[] args) {

        // vystvorenie prvej knihy
        Kniha kniha1 = new Kniha(); // Vytvorili sme objekt (alebo inštanciu triedy) s názvom kniha1
        kniha1.nazov = "java";
        kniha1.autor = "Vysnanova";
        kniha1.cena = 5.50;
        kniha1.rokVydania = 1999;


// ako vypisat obsah kniha 1
        System.out.println("Názov knihy: " + kniha1.nazov);
        System.out.println("Autor knihy: " + kniha1.autor);
        System.out.println("Cena knihy: " + kniha1.cena);
        System.out.println("Rok vydania knihy: "+ kniha1.rokVydania);
        System.out.println("--------------------------------");
// vytvorenie druhej knihy
        Kniha kniha2 = new Kniha();
        kniha2.nazov = "Ja, robot";
        kniha2.autor = "Isaac Asimov";
// vypis druhej knihy
        System.out.println("Názov knihy: " + kniha2.nazov);
        System.out.println("Autor knihy: " + kniha2.autor);
// knihy vložíme do ArrayList-u
        ArrayList<Kniha> knihy = new ArrayList<>();
        knihy.add(kniha1);
        knihy.add(kniha2);
// ako vypísať obsah knihy
 for (Kniha knihaObjekt:knihy){
     //System.out.println(knihaObjekt); > vypíše nezrozumitelny text

     System.out.println("---------------------------------------------------------------");
     System.out.println("Názov knihy:" + knihaObjekt.nazov);
     System.out.println("Augor knihy: "+ knihaObjekt.autor);
     System.out.println("Cena knihy: " + knihaObjekt.cena);
     System.out.println("Rok vydania knihy: " + knihaObjekt.rokVydania);
 }
    }
}
