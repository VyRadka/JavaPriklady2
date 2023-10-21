public class PoliaNazvyAut {
    public static void main(String[] args) {
//deklarácia pola s názvom znackyAut, ktore obsahuje značky áut
        String[] znackyAut = {"Volvo", "BMW", "Ford", "Mazda"};
//vypis prvého auta
        System.out.println(znackyAut[0]); // volvo sa nachádza pod indexom 0
//vypis poslednu značku
        System.out.println(znackyAut[3]);
//ak by sme chceli prepisat znacku
        znackyAut[0] = "opel";
        System.out.println(znackyAut[0]);
 //pocet vsetkych znaciek v poli je →→vypise pocet subjektov v poli
        System.out.println(znackyAut.length);
        System.out.println("vypíše všetky značky áut:");
        System.out.println("------------------------");
 // vypise vsetky značky áut v poli
            // použite for- for je cyklus, ktory sa bude opakovať
        for (int i = 0; i < znackyAut.length; i++) {
            //↑ vysvetlenie hore int spravidla sa dava premenna i, ktora ma na zaciatku hodnotu 0, za bodkočiarkou máme PODMIENku, že ked i mensie ako dĺžka pola, i++ znamená, že si to íčko zväční, čiže
            System.out.println(znackyAut[i]);
        }
 //vyouse vsetjy značky aut cez for
        System.out.println();
        System.out.println("vypíše všetky značky áut cez for:");
        System.out.println("------------------------");
        // vypise vsetky značky áut v poli
        for (String konkretnaZnacka:znackyAut){
            System.out.println(konkretnaZnacka);
        }
    }
}
