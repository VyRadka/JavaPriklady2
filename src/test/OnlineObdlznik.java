package test;
import java.util.Scanner;
public class OnlineObdlznik {
    public static void main(String []args) {


        while (true) {
            Scanner skener = new Scanner(System.in);
            System.out.println("""
                     Vítam Ťa v programe na výpočet obvodu a obsahu obdĺžnika. Zadaj jednu s nasledujúcich možností:
                            (s)tart = pre zadanie strán a, b a následný výpočet obsahu / obvodu
                            (q)uit = ukončenie programu
                    """);
            String vstup = skener.nextLine();

            if (vstup.equals("s")) {
                System.out.println("Zadaj dĺžku strany A: ");
                double stranaA = skener.nextDouble();

                System.out.println("Zadaj dĺžku strany B: ");
                double stranaB = skener.nextDouble();

                System.out.println("Obvod obdĺžnika je:  " + vypocitajObvodObdlznika(stranaA, stranaB));
                System.out.println("Obsah obdlžnika je: " + vypocitajObsahObdlznika(stranaA, stranaB));
            } else if (vstup.equals("q")) break;
                skener.nextLine();
        }
    }
    public static double vypocitajObvodObdlznika(double stranaA, double stranaB){
        return 2*(stranaA + stranaB);
    }
    public static double vypocitajObsahObdlznika(double stranaA, double stranaB){
        return stranaA*stranaB;
    }
}

