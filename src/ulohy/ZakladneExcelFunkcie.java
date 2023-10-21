package ulohy;
/*Úloha č. 1: Úloha na základné Excel funkcie.
        Vytvorte pole s ľubovoľným počtom čísel (napr. 5-tich), ktorými budeme prechádzať a jednotlivé hodnoty sčítavať, čiže výsledkom bude celkový súčet hodnôt.
        Bonusová úloha: Vytvorte metódu (napr. s názvom scitaj() resp. v angličtine getSum()), ktorá bude vracať výsledok po sčítaní.
        Bonusová úloha č. 2 (samostatne riešená): Vytvorte metódu priemeruj(), ktorá vypočíta priemer z daných čísiel.
        Bonusové úlohy naviac: Vytvorte metódu pocet(), ktorá zistí počet čísel v poli. Zároveň by tam mohla metóda, ktorá zisti najväčšie číslo v poli max(). Analogicky aj metódu min(), ktorá zisti najmenšie číslo v poli.*/

public class ZakladneExcelFunkcie {

    public static void main(String[] args) {
        double [] cisla = {1, 2, 3, 4, 5}; // vytvorenie a naplnenie pola s desatinnymi cislami
        double sum = 0; /*// vytvorili sme si premennú sumár
        // prechádzame k cyklom*/
        for (int i=0; i < cisla.length ; i++) { /*// cisla.length definuje, že ak je i menšie ako cisla.length to je 5 dokopy, tak to je pravda tak sa to vykoná a i++ znamená, že sa zväčši o jedno čislo
 //vypise cisla           System.out.println(cisla[i]); // i je index od 0-4*/
            sum = sum + cisla[i]; /*// musim taktiež inicializovat sum, ciže ho dám ako nula → interpretácia sum je 0 a cisla[i] su 12345 → ciže pri prvej iletirácii bude mať tá premenná sum číslo 1, ale cyklus nekoncí, lebo i je mensie ako dlžka pola, čiže zoberem dalšie čislo čo je 2 a to pripočíta k tej povodnej čo bola 1 a ten obsah zas vloži do sum a pokračuje takto dalej, až kým nenaplní cyklus
*/ //identický zapis je aj sum +=[i];

/* // System.out.println("Výsledok sčítania hodnôť polí je: " + sum); →  ak to vložím pred zalomenu zatvorku, tak mi každy riadok vypise*/
        }
        // ak označím od riadku 28 po riadok 12 + pravim extrahovat vložím get sum, tak sa mi extrahuje na navratovu metodu get navratove set nastavovane

        System.out.println("Výsledok sčítania hodnôť polí je: " + sum);  // tu sme zadali ten výstup, vypiše mi sučet spolu celého cyklu*/
    }
}
