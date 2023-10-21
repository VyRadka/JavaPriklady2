package gui.kalkulacka;
// existuje knižnica naschon, ktora existuje interpretovat text

import java.util.Scanner;

public class Kalkulacka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vysledek = 0;
        boolean prvniVstup = true;
        char operator = ' ';

        while (true) {
            System.out.print("Zadejte číslo a stiskněte Enter: ");
            double cislo = scanner.nextDouble();

            if (prvniVstup) {
                vysledek = cislo;
                prvniVstup = false;
            } else {
                switch (operator) {
                    case '+':
                        vysledek += cislo;
                        break;
                    case '-':
                        vysledek -= cislo;
                        break;
                    case '*':
                        vysledek *= cislo;
                        break;
                    case '/':
                        if (cislo != 0) {
                            vysledek /= cislo;
                        } else {
                            System.out.println("Dělení nulou není povoleno.");
                            return;
                        }
                        break;
                    case '=':
                        System.out.println("Výsledek: " + vysledek);
                        return;
                    default:
                        System.out.println("Neplatný operátor.");
                        return;
                }
            }

            System.out.print("Zadejte operátor (+, -, *, /, =) a stiskněte Enter: ");
            operator = scanner.next().charAt(0);
        }
    }
