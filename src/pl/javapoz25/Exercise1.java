package pl.javapoz25;

import java.util.Scanner;

public class Exercise1 {

    public static int varToMultiply() {

        Scanner in = new Scanner(System.in);

        System.out.print("Podaj liczbę, którą chcesz pomnożyć: ");
        int var1 = in.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(var1 + " * " + i + " = " + (var1 * i));
        }
        return var1;
    }

}
