package pl.javapoz25;

import java.util.Scanner;

public class Exercise2 {

    public static boolean isPrime() {

        Scanner in = new Scanner(System.in);

        System.out.print("Podaj liczbę, którą chcesz sprawdzić: ");
        int var2 = in.nextInt();

        if (var2 < 2) {
            System.out.println("Podaj liczbę większą od 2");
        }

        boolean isPrimeNumber = true;

        for (int i = 2; i < var2; i++) {
            if (var2 % i == 0){
                isPrimeNumber = false;
            }
        }

        if (isPrimeNumber)
            System.out.println("Podana liczba jest liczbą pierwszą");
        else
            System.out.println("Podana liczba nie jest liczbą pierwszą");

        return isPrimeNumber;
    }

}
