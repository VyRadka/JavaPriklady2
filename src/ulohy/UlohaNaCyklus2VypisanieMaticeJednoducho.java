package ulohy;
/*Uloha c.2 Vytvorte obdobnú maticu, ktorá bude obsahovať 2-nasobok tej predchádzajúcej hodnoty(začneme1) takže bude to vyzerať nasledovne:
1 2 4 8 16
32 64 128 256 512
        ....*/
public class UlohaNaCyklus2VypisanieMaticeJednoducho {
    public static void main(String [] args) {

        int mojeCislo1 = 1;    // začiatočné cislo

        for (int i = 1; i <= 5; i++) {  // to znamena, že pojde ten cyklus od 1do 5
            for (int j = 1; j <= 5; j++) {
                System.out.print(mojeCislo1 + "\t"); //toto vypise tu začiatočnú jednotku a nasledne sa v dalsom kroku vynásobi dvomi a tým, že tento cyklus je určený dalšou literáciou tým jčkom tak vypíše dvojku, potom 4, potom 8 a potom 16 a tým, že hore máme vypísané i<=5 sa tento cyklus opakuje 5x v riadku s jecko definuje, že sa cyklus opakuje 5 riadkov
                mojeCislo1 *= 2; // Vynásobeníe predchádzajúceho cisla *2
            }
            System.out.println();
        }
    }
}
