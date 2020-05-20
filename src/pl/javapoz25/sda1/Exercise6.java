package pl.javapoz25.sda1;

public class Exercise6 {

    public static void negativeNumbers() {

        int[] tab = {1, -80, 54, 99, -157, 605, -10, -89};

        int counter = 0;

        for (int number : tab) {
            if (number < 0) {
                counter++;
            }
        }
        System.out.println("Ilość licz ujemnych w tablicy: " + counter);

        int[] newTab = new int[counter];
        int j = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                newTab[j] = tab[i];
                j++;
            }
        }
        TablePrinter.printTable(newTab);
    }
}
