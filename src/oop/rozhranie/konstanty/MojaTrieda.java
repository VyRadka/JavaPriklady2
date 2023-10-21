package oop.rozhranie.konstanty;


interface Konstanty {
    int MAX_POCET = 100;// takto ked napísem veľkým tak to bere ako final,
    String DEFAULT_NAZOV= "Štandardné meno";

}


public class MojaTrieda implements Konstanty {
    public void vypisKonstanty(){
        System.out.println("Maximálny počet: " + MAX_POCET);
        System.out.println("Predvolený názov je: " + DEFAULT_NAZOV);
    }

    public static void main(String[] args) {
        MojaTrieda mojaTriedaObjekt = new MojaTrieda();
        mojaTriedaObjekt.vypisKonstanty();


    }
}
