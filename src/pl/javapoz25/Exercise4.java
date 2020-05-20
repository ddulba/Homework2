package pl.javapoz25;

import java.util.Scanner;

public class Exercise4 {

    public static void switchTable(int[] tab) {

        Scanner in = new Scanner(System.in);

        if (tab.length <=3) {
            System.out.println("Tablica przed wykonaniem operacji:");
            TablePrinter.printTable(tab);

            int tmp = tab [0];
            tab[0] = tab[2];
            tab[2] = tmp;

            System.out.println("Tablica po wykonaniu operacji");
            TablePrinter.printTable(tab);
        }

    }
}
