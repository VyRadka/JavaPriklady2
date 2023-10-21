package oop.abstrakt;

public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.run();
        myPig.sleep();
        System.out.println("------------------------");

        Dog myDog = new Dog();
        myDog.sleep();
        myDog.animalSound();
        myDog.run();
    }
}
