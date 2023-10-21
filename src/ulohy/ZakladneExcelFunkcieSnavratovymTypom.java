package ulohy;

import java.util.Arrays;

public class ZakladneExcelFunkcieSnavratovymTypom {

    public static void main (String[] args) {
        double[] cisla = {1, 2, 3, 4, 5};

        System.out.println("Výsledok sčítania hodnôt v poli je: " + scitaj(cisla)); //
        int pocetCislejVDouble = cisla.length;

        double priemer = priemeruj(cisla); // definovanie priemerovania
        System.out.println("Vysledok priemeru čísel je: " + priemer);

        double priemerJednoduchsie = priemerujJednoduchsie(cisla); // definovanie priemerovania
        System.out.println("Vysledok priemeru čísel JEDNODUCHSIM spôsobom s volanim už metody sčítaj: " + priemerJednoduchsie);

        System.out.println("Vypise pocet cisiel v poli double:" + pocetCislejVDouble);



// metoda s nazvom pocet na zistenie poctu vystupnych hodnot (pola)
       int[] pocet = {1, 2, 3, 4, 5, 6, 7, 5, 25};
        System.out.println("Metoda vypise pocet poli: " + pocet.length); // vypise pocet cisiel v poli


// metoda na zistenie najväčšieho cisla v poli
        int max = pocet[0];
        for (int i = 1; i < pocet.length; i++) {
            if (pocet[i] > max) {
                max = pocet[i];
            }
        }
        System.out.println("Najväčšie číslo v poli je: " + max);


 // metoda na zistenie najnižšieho cisla v poli
        int min = pocet[0];
        for (int i = 1; i < pocet.length; i++) {
            if (pocet[i] < min) {
                min = pocet[i];
            }
        }
        System.out.println("Najnižšie číslo v poli je: " + min);
    }

// metoda scitania hodnot v poli
    public static double scitaj(double[] cisla) {
        double sum =0;
        for (int i = 0; i < cisla.length; i++) {
            sum = sum + cisla[i]; // scita cisla dane v poli
        }
        return sum;
    }

// metoda priemerovania hodnot v poli
    public static double priemeruj(double[] cisla) {
        double sum = 0;
        for (int i = 0; i < cisla.length; i++) {
            sum = sum + cisla[i]; // zpriemeruje cisla dane v poli
        }
        return sum / cisla.length;
    }

// metoda priemerovania hodnot v poli jednoduchším sôsobom
    public static double priemerujJednoduchsie(double[] cisla) {
        return scitaj(cisla) / cisla.length; // jednoduchsie to je, ze sme si rovno zavolali tu metodu scitaj, ktoru sme predtym vykonali a vydelili sme počtom v poli.
    }
}


