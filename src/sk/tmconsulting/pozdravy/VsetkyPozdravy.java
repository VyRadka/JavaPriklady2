package sk.tmconsulting.pozdravy;
/*Vo všetkých balíčkoch okrem sk.tmconsulting.pozdravy vytvorte triedu, ktorá sa bude volať Ahoj, Szia, Hallo, Hello. Každá trieda bude mať statickú metódu s názvom pozdravujem(). Daná metóda bude do konzoly vypisovať pozdrav v príslušnom jazyku.
        Avšak volanie metód spravíme v triede VsetkyPozdravy, v ktorom zavoláme jednotlivé pozdravy konkrétnych tried.*/

import sk.tmconsulting.pozdravy.anglicky.Hello;
import sk.tmconsulting.pozdravy.madarsky.Szia;
import sk.tmconsulting.pozdravy.nemecky.Hallo;
import sk.tmconsulting.pozdravy.slovensky.Ahoj;

public class VsetkyPozdravy {
    public static void main(String[] args) {
        Hello.pozdravujem();
        Szia.pozdravujem();
        Ahoj.pozdravujem();
        Hallo.pozdravujem();
        System.out.println("-----------------------------------------");
 // Dynamicke volanie metod

 // ak chceme volať nestatické metody, musíme najskôr vytvoriť objekty alebo inštanciu triedy

        Hello helloObjekt = new Hello (); //Vytvorenie objektu, resp. instanciu triedy Hello
        helloObjekt.pozdravujemDynamicky();

        Szia sziaObjekt = new Szia();
        sziaObjekt.pozdravujemDynamicky();

        Hallo halloObjekt = new Hallo();
        halloObjekt.pozdravujemDynamicky();

        Ahoj ahojObjekt = new Ahoj();
        ahojObjekt.pozdravujemDynamicky();
    }
}
