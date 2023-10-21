package oop.rozhranie.animal;


    class Main {
        public static void main(String[] args) {
            Pig myPig = new Pig();  // Create a Pig object
            myPig.animalSound();
            myPig.sleep();

            Dog myDog = new Dog();
            myDog.animalSound();
            myDog.sleep();
            myDog.stekanie();


        }
    }
