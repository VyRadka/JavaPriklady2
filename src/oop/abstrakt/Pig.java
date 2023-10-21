package oop.abstrakt;

public class Pig extends Animal{
    @Override
    void animalSound() {
        super.animalSound();
        System.out.println("prasa kvika");
    }

    @Override
    void sleep() {
        super.sleep();
        System.out.println("Prasa spi Zzzzzzzzzzzzzzz");
    }

    @Override
    void run() {

    }
}
