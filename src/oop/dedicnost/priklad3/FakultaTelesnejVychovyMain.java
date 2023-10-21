package oop.dedicnost.priklad3;

public class FakultaTelesnejVychovyMain {
    public static void main(String[] args) {
        // Vytvorili sme sportovca c.1
        Sportovec jozko = new Sportovec(180,85,25);
        jozko.maKondicku();
        jozko.trenuje();
        jozko.bezi();

        /*jozko.hmotnost = 85;
        jozko.vyska = 180;*/
        jozko.vypisHmotnost();
        jozko.vypisVyska();
        jozko.lieta();



        Sportovec zuzka = new Sportovec(170,55,30);
        zuzka.kraca();
        zuzka.trenuje();
/*        zuzka.vyska = 175;
        zuzka.hmotnost = 58;*/
        zuzka.vypisVyska();
        zuzka.vypisHmotnost();

        // Vytvorili ms evedca c.1
        Vedec ivana = new Vedec(160,58,35);
        ivana.objavuje();
        ivana.skuma();
/*        ivana.vyska = 165;
        ivana.hmotnost = 48;*/
        ivana.vypisHmotnost();
        ivana.vypisVyska();
    }
}
