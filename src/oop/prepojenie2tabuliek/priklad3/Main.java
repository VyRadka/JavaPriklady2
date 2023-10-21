package oop.prepojenie2tabuliek.priklad3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Kniha kniha1 = new Kniha("Já robot ", 1969, new Autor("Isaac", "Assimov", LocalDate.of(1950,8,9)));
        System.out.println(kniha1);
        System.out.println("+++++++++++++++++++++++++++++000000000000000");
        System.out.println("Názov knihy 1 je: " + kniha1.getNazovKnihy());
        System.out.println("Rok vydania knihy1 je: " + kniha1.getRokVydania());
        System.out.println("Priezvisko autora knihy 1 je: "+ kniha1.getAutor().getPriezvisko());
        System.out.println("Meno autor knihy 1 je: "+ kniha1.getAutor().getMeno());
        System.out.println("Dátum narodenia autora 1 je: " + kniha1.getAutor().getDatumNarodenia());

        System.out.println("-------------------------------------------------------");
//vytvorili sme knihu 2 volanim setterov
        Kniha kniha2 = new Kniha(null,0, null) ;// čiže sme nenaplnili konstruktory, rok vydania sme museli dať nulu, lebo je to int
        // naplnili sme to volanim jednotlivych setterov
        kniha2.setNazovKnihy("Duna");
        kniha2.setRokVydania(1979);
        Autor autor2 = new Autor("Volodin", "Sergej",LocalDate.of(1954,02,3));// Vytvorenie autora 2 pre knihu 2
        kniha2.setAutor(autor2);
        System.out.println(kniha2); // toto vypise obsah objektu, pretože trieda obsahuje metodu toString
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
    //alebo to môžeme vypisat nasledovnym sposobom:
        System.out.println("Názov knihy 2 je: " + kniha2.getNazovKnihy());
        System.out.println("Rok vydania knihy2 je: " + kniha2.getRokVydania());
        System.out.println("Priezvisko autora knihy 2 je: "+ kniha2.getAutor().getPriezvisko());
        System.out.println("Meno autor knihy 2 je: "+ kniha2.getAutor().getMeno());
        System.out.println("Dátum narodenia autora 2 je: " + kniha2.getAutor().getDatumNarodenia());

 // definovana vypisana 3kniha0
        System.out.println("--------------------------------------------------");
        Kniha kniha3 = new Kniha();
        kniha3.setNazovKnihy("Java pre začiatočníkov.");
        kniha3.setRokVydania(2019);
        kniha3.setAutor(new Autor("Ján", "Žitniak", LocalDate.of(2023,12,12)));
        System.out.println(kniha3);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Názov knihy 3 je: " + kniha3.getNazovKnihy());
        System.out.println("Rok vydania knihy3 je: " + kniha3.getRokVydania());
        System.out.println("Priezvisko autora knihy 3 je: "+ kniha3.getAutor().getPriezvisko());
        System.out.println("Meno autor knihy 3 je: "+ kniha3.getAutor().getMeno());
        System.out.println("Dátum narodenia autora 3 je: " + kniha3.getAutor().getDatumNarodenia());

        System.out.println("\nZoznam všetkých kníh využitím pomocnej triedy Zoznamknih");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        ArrayList<Kniha> knihy1 = new ArrayList<>();
        // aby sme ten zoznam knih odovzdali, musime tam pridat ten arraylist:
        ZoznamKnih zoznamKnih1 = new ZoznamKnih();

        zoznamKnih1.pridajKnihu(knihy1,kniha1);// pridanie knihy
        zoznamKnih1.pridajKnihu(knihy1,kniha2);
        zoznamKnih1.pridajKnihu(knihy1,kniha3);
        zoznamKnih1.vypisVsetkyKnihy(knihy1); // zobrazenie všetkých kníh
    }
}
