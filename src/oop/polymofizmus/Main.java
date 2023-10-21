package oop.polymofizmus;


import java.lang.reflect.Array;
import java.util.ArrayList;

class Zviera {
        public void zvieraciZvuk(){
            System.out.println("Zviera vydáva zvuk.");
        }
    }
    class Prasa extends Zviera{
        public void zvieraciZvuk(){
            System.out.println("Prasa robí kvik kvik");
        }
    }
    class Pes extends Zviera{
        public void zvieraciZvuk(){
            System.out.println("Pes robi: hav hav");
        }
        public void steka(){
            System.out.println("Hav hav hav hav");
        }
    }
    class Main{
        public static void main(String[] args) {
            Zviera mojeZviera = new Zviera(); // vytvorenie zvieracieho objektu, konkretneho zvierata
            Zviera mojePrasa = new Prasa(); // vytvorenie konkretneho prasata// tu je tiež rozdiel v dedicnosti by som dala na zaciatku triedu Prasa, ale tu davam ako keby tu hlavnu triedu, čiž zviera
            Zviera mojPes = new Pes();
          mojeZviera.zvieraciZvuk();
            mojPes.zvieraciZvuk();
            mojePrasa.zvieraciZvuk();



            // vytvorime farmu so zvieratami, v ktorej budu jednotlive zvierata
           /* ArrayList <Zviera>farma = new ArrayList();
            farma.add(mojPes);
             farma.add(mojePrasa);

             for (Zviera konkretneZviera: farma){
                 konkretneZviera.zvieraciZvuk();
             }*/
        }
    }








/*
package oop.polymorfizmus;

        import java.util.ArrayList;

abstract class Animal {
    public abstract void animalSound();
    public void run() {
        System.out.println("Animal runs");
    }
}

class Pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Kvik kvik");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Bark bark");
    }

    @Override
    public void animalSound() {
        System.out.println("Hav hav");
    }
}

class LittleDog extends Dog {
    @Override
    public void animalSound() {
        System.out.println("The litle dog says: hav hav");
    }
}

class Main {
    public static void main(String[] args) {
        //Animal myAnimal = new Animal();  // Create a Animal object
        Pig myPig = new Pig();  // Create a Pig object
        Dog myDog = new Dog();  // Create a Dog object
        LittleDog myLittleDog = new LittleDog();
        Animal myBigDog = (Dog) myLittleDog;
        // Dog myDog2 = (Dog) myDog;

        //myAnimal.animalSound();
        myPig.animalSound();
        myPig.run();
        myDog.animalSound();
        myDog.run();
        // myDog.bark(); // Toto nemozeme zavolat v ramci pouzitia polymorfizmu

        // Vytvorme farmu zvierat, v ktorej budu zaregistrovane jednotlive zvierata
        //ArrayList<Animal> farm1 = new ArrayList<>();
        var farm = new ArrayList<Animal>();
        farm.add(myPig);
        farm.add(myDog);
        farm.add(myLittleDog);

        for (Animal concreteAnimal : farm) {
            concreteAnimal.animalSound();
            concreteAnimal.run();
        }

    }
}*/
