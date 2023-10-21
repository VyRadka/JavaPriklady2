package oop.dedicnost.priklad4.cicavec;
/*Vytvorte rodičovskú triedu, ktorá sa bude volať Cicavec. Bude obsahovať spoločné atribúty (vlastnosti) a metódy (činnosti) cicavcov. A následne vytvorte triedy Pes, Mačka, Kôň, Ovca, ktoré budú dané vlastnosti a metódy dediť.
        Pozn.: Pokúste sa “prepísať” metódy, ktoré sú naviazané na konkrétne zviera, napr. Cicavec bude obsahovať metódu prejavSa(), kde daný cicavec sa prejaví nejakým zvukom, napr. pes zašteká, mačká zamňauká, kôň zaerdží, …*/


public class Cicavec {
    protected String farba;
    protected String rasa;
    protected String druh;
    protected double vaha;
    protected double dozitie;

    public Cicavec(String farba, String rasa, String druh, double dozitie, double vaha){
        this.farba = farba;
        this.rasa = rasa;
        this.druh = druh;
        this.vaha = vaha;
        this.dozitie = dozitie;
    }
    public Cicavec(String farba, double vaha,String druh){
        this.farba = farba;
        this.vaha = vaha;
        this.druh = druh;
    }
    public void prejavSa(){
        System.out.println("Zviera vydáva zvuk.");
    }
    public void vztahKcloveku(){
        System.out.println("Zviera má vzťah k človeku?:");
    }
    public void kdeZvieraZije(){
        System.out.println("Zviera žije v: ");
    }

}
