package oop.dedicnost.priklad4.cicavec;

public class Kon extends Cicavec{
    public Kon(String farba, double vaha, String druh) { super (farba,vaha,druh); }

   @Override
    public void prejavSa(){
        System.out.println("Kôň erdží. ");
    }

    public static void main(String[] args) {
        Kon mojKon = new Kon("Hnedý", 185.5, "Mustang");
        System.out.println("Kôň má farbu: " +mojKon.farba);
        System.out.println("Kôň váží: "+ mojKon.vaha+ "kg");

        System.out.println();

        mojKon.kdeZvieraZije();
        System.out.println("Aj vo voľnej prírode aj medzi ľuďmi");
        mojKon.vztahKcloveku();
        System.out.println("Dokáže žiť s človekom.");

        mojKon.prejavSa();
    }

}
