package pl.javapoz25.sda1;

public class Exercise7 {

    public static int[] arithmeticSeries (int firstValue, int lenght, int diff) {

        if (lenght < 2) {
            System.out.println("Ciąg musi mieć co najmniej dwie wartości!");
            int[] emptyTab = {};
            return emptyTab;
        }

        int[] tab = new int[lenght];
        tab[0] = firstValue;

        for (int i = 1; i < tab.length; i++) {
            tab[i] = tab[i - 1] + diff;
        }
        TablePrinter.printTable(tab);

        return tab;
    }
}
