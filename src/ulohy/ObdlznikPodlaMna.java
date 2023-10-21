package ulohy;

/*Vytvorte triedu Obdlznik, v ktorej budú 2 statické metódy. Prvá na výpočet obvodu obdĺžnika (vypocitajObvod), druhá na výpočet jeho obsahu (vypocitajObsah).
        Dodatočná úloha vylepšenej verzie: Program bude zároveň od používateľa vyžadovať zadanie príkazu na prácu s programom. Ak zadá príkaz s, tak program vyžiada od používateľa zadanie strán a, b. Ak zadá q, tak program sa ukončí, ináč beží do “nekonečna”.
        Program po spustení zobrazí menu položky, ktoré môžu vyzerať nasledovne:
        Vítam Ťa v programe na výpočet obvodu a obsahu obdĺžnika. Zadaj jednu s nasledujúcich možností:
        (s)tart = pre zadanie strán a, b a následný výpočet obsahu / obvodu
        (q)uit = ukončenie programu

        Úloha pre lektora: Vytvorte jUnit testy s niekoľkými vstupnými scenármi.
        Update programu, vylepšená verzia by mohla robiť toto:
        Popis programu:
        Po spustení programu vypíše jednoduché menu, kde používateľ zadá možnosť:
        s alebo q
        pričom písmeno s od používateľa bude žiadať zadanie strán a, b. Po zadaní týchto strán vypočíta obvod a obsah obdlžnika a zobrazí ho do konzoly. Toto bude opakovať dovtedy, kým v menu nezadáme písmeno q. Po zadaní písmena q, program ukončí svoju činnosť a vypíše Koniec programu.*/


import java.util.Scanner;

public class ObdlznikPodlaMna {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);

        System.out.println("Zadaj dĺžku stranu a obdĺžnika");
        double dlzka = skener.nextDouble();

        System.out.println("Zadaj sirku strany b obdlžnika");
        double sirka = skener.nextDouble();

     double obsah = vypocitajObsahobdlznika(dlzka,sirka);
     double obvod = vypocitajObvodObdlznika(dlzka,sirka);
        System.out.println("obsah obdlžnika s dĺžkou " + dlzka + " a šírkou " + sirka + " = " + obsah);
        System.out.println("obvod obdlznika s dlžkou strany a " + dlzka + " a šírkou strany b " + sirka + " =" + obvod);

        skener.close();

    }
   public static double vypocitajObsahobdlznika (double dlzka, double sirka){
        return dlzka*sirka;
   }
   public static double vypocitajObvodObdlznika (double dlzka, double sirka){
        return 2*(dlzka+sirka);
   }
}