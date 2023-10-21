public class CyklySPevnymPoctomOpakovani {
    public static void main(String [] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);

        }
        System.out.println(); //prazdny riadok
        for (int i = 0; i <= 10; i++) {
            System.out.print(i);

        }
        System.out.println(); // prazdny riadok
        //vypis parne cisla
        for (int i = 2; i <= 10; i += 2) { //môžeme to zapísať aj ako i=i+2 resp i+=2
            System.out.print(i);
        }
        //vypis parne cisla odzadu
        System.out.println();
        for (int i = 10; i >0; i = i - 2) {
            System.out.print(i+"\t");
        }

        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((j * i) + "\t");
            }
            System.out.println();
        }
        System.out.println();
        // TODO: 22. 9. 2023 ako vypísať hodnoty od 1 do 100, aby v prvom riadku vypísal od 1do10, potom od 11po 20 atd
        System.out.println("TODO: 22. 9. 2023 ako vypísať hodnoty od 1 do 100, aby v prvom riadku vypísal od 1do10, potom od 11po 20 atd");
        for (int i = 1; i <=100; i++) {
            System.out.print(i+"\t");
            if (i % 10 ==0) System.out.println();

        }
        System.out.println("\nPodobná úloha ako vyššie s využitim 2 cyklov, resp. vnoreného.");
        // Podobna uloha ako vyssie s vyuzitim 2 cyklov, resp. vnoreneho
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((10 * i + j) + "\t");
            }
            System.out.println();
        }

    }
}
