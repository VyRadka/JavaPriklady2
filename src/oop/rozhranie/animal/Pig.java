package oop.rozhranie.animal;

// Pig implementacia animal rozhrania
class Pig implements Animal {

    @Override
    public void animalSound() {
        System.out.println("prasa robi kvik kvik");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzzzz");
    }
}