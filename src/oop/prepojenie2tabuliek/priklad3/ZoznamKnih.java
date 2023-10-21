package oop.prepojenie2tabuliek.priklad3;

import java.util.ArrayList;

public class ZoznamKnih implements IZoznamKnih {
// implementovali sme metody cez cervenu žiarovku
    @Override
    public void pridajKnihu(ArrayList knihy, Kniha kniha) {
        knihy.add(kniha);


    }

    @Override
    public void vypisVsetkyKnihy(ArrayList<Kniha> knihy) {
        for (Kniha konkretnaKniha:knihy){
        System.out.println(konkretnaKniha);
}
    }
}
