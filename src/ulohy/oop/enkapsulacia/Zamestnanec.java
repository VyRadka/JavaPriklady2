package ulohy.oop.enkapsulacia;

public class Zamestnanec {
    // Vytvorilie sme atributy (fields) triedy
    private String meno;
    private String priezvisko;
    private String pohlavie;
    private int rokNarodenia;


    // Bezparametricky konstruktor
    // Prazdny konstruktor
    public Zamestnanec() {
    }

    // Parametricky konstruktor
    // Prvotny zmysel je naplnenie objektu (instancie triedy)
    public Zamestnanec(String meno, String priezvisko, int rokNarodenia, String pohlavie) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.pohlavie = pohlavie;
        this.rokNarodenia = rokNarodenia;

    }

    public String getNazov() {
        return meno;
    }

    public void setNazov(String nazov) {
        // Dalsia aplikacna logika, prip. nejaka kontrola, overenie premennej (parametra) nazov predtym ako ju ulozime do atribut triedy
        this.meno = nazov;
    }

    public String getAutor() {
        return priezvisko;
    }

    public void setAutor(String autor) {
        this.priezvisko = autor;
    }

    public int getRokNarodenia() {
        return rokNarodenia;
    }

    public void setRokVydania(int rokVydania) {
        this.rokNarodenia = rokNarodenia;
    }

    public String getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(String pohlavie) {
        this.pohlavie = pohlavie;
    }

    @Override
    public String toString() {
        return "Meno: " + meno + "\nPriezvisko: " + priezvisko + "\nPohlavie: " + pohlavie + "\nRok narodenia: " + rokNarodenia;
    }
}