package oop.abstrakt;

public abstract class Animal {
    void animalSound(){
        System.out.println("Zviera sa prajavuje nejakým zvukom");
    };
    void sleep(){
        System.out.println("Zviera spí.");          // 4-8 riadok je metoda ktora ma implementaciu a nsledne dole je metoda, ktora caka na implementáciu

    }
    abstract void run(); // Metoda oznacena abstract je nanutena pri implementacii. Zaroven musi byt aj v riede vlozene z abstract
}
