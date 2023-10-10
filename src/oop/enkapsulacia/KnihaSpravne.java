package oop.enkapsulacia;

public class KnihaSpravne {
//Vytvorili sme atributy (Fields) triedy
    private String nazov;
    private String autor;
    private int rokVydania;
    private double cena;

// bezparametricky konstruktor -  prázdny konštruktor
    public KnihaSpravne() {
    }

    // parametrický konštruktor 11.09.2023 56:41
// prvotný zmysel je naplnenia objektu (inštnacie triedy)
    public KnihaSpravne(String nazov, String autor, int rokVydania, double cena) {
        this.nazov = nazov;
        this.autor = autor;
        this.rokVydania = rokVydania;
        this.cena = cena;
    }

    public String getNazov() {
// ďalšia aplikačný logika, príp. nejaka kontrola, overenie premennej (parametra) nazov predtym ako ju ulozime do atributu triedy
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }


    @Override//znamena, ze metoda je predpisana
    public String toString() {
        return "Názov knihy: " + nazov + "\nAutor Knihy: " + autor + "\nCena knihy: " + cena + "\nRok vydania: " + rokVydania;
    }
}
