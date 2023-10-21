package oop.rozhranie.animal;

public class Dog implements Animal{
    @Override
    public void animalSound() {
        System.out.println("pes robi haf haf haf");
    }

    @Override
    public void sleep() {
        System.out.println(" Zzzzzzzzzz ");
    }
    public void stekanie()  {
        System.out.println("Vrrrrrrrrrrrrrr");
    }
}
