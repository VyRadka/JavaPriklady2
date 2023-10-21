package oop.prepojenie2tabuliek.priklad1;

import java.time.LocalDate;

public class EvidenciaZamestnancov {
    public static void main(String[] args) {
        Zamestnanec radka = new Zamestnanec("Radovana", "Vyšňanová", LocalDate.of(2000,12,3), new Zamestnavatel("Úpsvr", "Banská Štiavnica", "Banská Štiavnica", "96901"));
        System.out.println(radka); // toto vypise vdaka metode toString, ktoru sme vygenerovali v zamestnancovi.. Vypise vsetky udaje

// môžeme vypisat len konkretnu informaciu
        System.out.println("meno zamestnanca: "+ radka.getMeno());
        System.out.println("Priezvisko zamestnanca: "+ radka.getPriezvisko());

// ak by sme chceli niečo ovplyvnit, napriklad zmenit jeho meno
        radka.setPriezvisko("Sikulová");
        System.out.println(radka);

    }
}
