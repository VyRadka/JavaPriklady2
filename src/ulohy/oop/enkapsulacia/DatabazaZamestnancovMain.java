package ulohy.oop.enkapsulacia;

/*Úloha č.1:
Vytvorte zoznam zamestnancov (DatabazaZamestnancov) v ktorej uložíme zamestnancov s údajmi ako je meno, priezvisko, pohlavie a rok narodenia. Využijeme princípy zapúzdrenia (encapsulation), čiže tvorba modelu a použitie getterov a setterov. Vytvorenie aspoň 2 zamestnancov využitím princípu zapúzdrenia a nezabudnite na použitie konštruktorov a metódy toString(). Uloženie do dynamického poľa (čiže ArrayList-u) a následné vypísanie.*/

        import java.util.ArrayList;

public class DatabazaZamestnancovMain {
    public static void main(String[] args) {

        Zamestnanec zamestnanec1 = new Zamestnanec("Jan", " Žitniak", 1975, "Muž"); // Vytvorili sme objekt (instanciu triedy) Kniha

        System.out.println("Detail zamestnanca č.1:");
        System.out.println("-------------------");
        System.out.println(zamestnanec1);

        System.out.println(); // Prazdny riadok

        Zamestnanec zamestanec2 = new Zamestnanec("Anton", "Kostrab", 1980, "Muž");
        System.out.println("Detail zamestnanca č.2:");
        System.out.println("-------------------");
        System.out.println(zamestanec2);

        //  Ulozime do ArrayList-u
        ArrayList<Zamestnanec> zamestnanec = new ArrayList<>();
        zamestnanec.add(zamestnanec1);
        zamestnanec.add(zamestanec2);

        System.out.println("\nVypisujem zoznam všetkých zamestnancov v ArrayList-e");
        /*   System.out.println("--------------------------------------------");*/
        // Vypisanie obsahu

        for(Zamestnanec zamestnanecObjekt:zamestnanec) {
            System.out.println("--------------------------------------------");

            System.out.println(zamestnanecObjekt);
        }
    }
}
