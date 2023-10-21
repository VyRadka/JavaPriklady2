package oop.prepojenie2tabuliek.priklad3;
// Todo vytvorit metody, ktorymi budeme naplnat knihy do zoznamu knih a vypisanie vsetkých kníh

import java.util.ArrayList;

public interface IZoznamKnih {
    void pridajKnihu(ArrayList knihy, Kniha kniha); // vypisane metody na vyplnenie zoznamu knih
    void vypisVsetkyKnihy(ArrayList<Kniha> knihy);


}

