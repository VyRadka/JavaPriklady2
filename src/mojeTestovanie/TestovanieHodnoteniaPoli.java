package mojeTestovanie;

import java.util.Arrays;

public class TestovanieHodnoteniaPoli {
    public static void main(String[] args) {
        double[] poleCisiel = {12, 53, 65, 25, 28, 96, 32, 14, 55, 52, 25};

        double sucet = scitaj(poleCisiel);
        System.out.println("Výsledok sčítania čísiel v poli:" + sucet);

        double priemer = priemeruj(poleCisiel);
        System.out.println("Výsledok priemeru čísiel v poli: " + priemer);

        double priemerJednoduchsie = priemerujJednoducho(poleCisiel);
        System.out.println("Výsledok priemeru čísiel volaním metody scitaj:" + priemerJednoduchsie);

        System.out.println("Výsledok počtu čisiel v poli: " + vypisaniePoctuCisiel(poleCisiel));
        System.out.println("Najvyššie číslo v poli: " + maximalneCisloVpoli(poleCisiel));
        System.out.println("Najmenšie číslo v poli: " + minimalneCisloVpoli(poleCisiel));

    }

// Metoda scitania poli
    private static double scitaj(double[] poleCisiel) {
        double sucet = 0;
        for (int i = 0; i < poleCisiel.length; i++) {
            sucet += poleCisiel[i];
        }
        return sucet;
    }

 // metoda zpriemerovania cisiel
    private static double priemeruj(double[] poleCisiel) {
        double sucet = 0;
        for (int i = 0; i < poleCisiel.length; i++) {
            sucet += poleCisiel[i];
        }
        return sucet / poleCisiel.length;
    }

// Metoda priemerovania z metody scitaj
    private static double priemerujJednoducho(double[] poleCisiel) {
        return scitaj(poleCisiel) / poleCisiel.length;
    }

// Metoda na vypis poctu cisiel v poli
    private static double vypisaniePoctuCisiel(double[] poleCisiel) {
        return poleCisiel.length;
    }

// Metoda vypisu najväčšieho cisla v poli
private static double maximalneCisloVpoli(double[] poleCisiel) {
        return Arrays.stream(poleCisiel).max().getAsDouble();
}
private static double minimalneCisloVpoli (double [] poleCisiel){
        return Arrays.stream(poleCisiel).min().getAsDouble();

}
}
