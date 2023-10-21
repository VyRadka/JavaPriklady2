package oop.prepojenie2tabuliek.priklad3;

public class Kniha {
    private String nazovKnihy;
    private int rokVydania;
    private Autor autor; //previazeme triedu knihu s triedou autor

// toto je vygenerovany konstruktor bez parametrov, cize sme si neoznacovali nic pri generovani
    public Kniha() {
    }

// vygenerovany konstruktor, ktory je parametricky
    public Kniha(String nazovKnihy, int rokVydania, Autor autor) {
        this.nazovKnihy = nazovKnihy;
        this.rokVydania = rokVydania;
        this.autor = autor;


    }
// vygenerovali sme si get setter medzi dvomi zlozenymi zatvorkami!!!

    public String getNazovKnihy() {
        return nazovKnihy;
    }

    public void setNazovKnihy(String nazovKnihy) {
        this.nazovKnihy = nazovKnihy;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Kniha{" +
                "nazovKnihy='" + nazovKnihy + '\'' +
                ", rokVydania=" + rokVydania +
                ", autor=" + autor +
                '}';
    }
}
