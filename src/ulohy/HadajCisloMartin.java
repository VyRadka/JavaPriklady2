package ulohy;

import java.util.Random;
import java.util.Scanner;

public class HadajCisloMartin {
    public static void main(String[] args) {
        int cislo = new Random().nextInt(10) + 1;

        System.out.println("Hádaj číslo od 1 do 10.");
        var s = new Scanner(System.in);

        while (true) {
            try {
                int tip = s.nextInt();

                if (tip == cislo) {
                    System.out.println("BINGO! Uhádol si!");
                    break;
                } else if (tip < cislo) {
                    System.out.println("Číslo je väčšie ako tvoj tip.");
                } else {
                    System.out.println("Číslo je menšie ako tvoj tip.");
                }
            } catch (Exception e) {
                System.out.println("Musíš zadať číslo!");
                break;
            }
        }
        s.close();
    }
}