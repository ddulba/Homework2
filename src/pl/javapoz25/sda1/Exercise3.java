package pl.javapoz25.sda1;

import java.util.Scanner;

public class Exercise3 {

    public static int sumOfXY() {

        Scanner in = new Scanner(System.in);

        int sum = 0;

        System.out.print("Podaj pierwszą liczbę: ");
        int x = in.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int y = in.nextInt();

        if (y > x) {
            for (int i = x; i <= y; i++) {
                sum += i;
            }
            System.out.println("Suma liczb od " + x + " do " + y + " wynosi: " + sum);
        }
        else
            System.out.println("Pierwsza liczba nie może być mniejsze bądź równa drugiej");

        return sum;
    }
}
