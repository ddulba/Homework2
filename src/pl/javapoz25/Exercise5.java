package pl.javapoz25;

public class Exercise5 {

    public static void minMaxTable() {

        int[] tab = {1, -80, 54, 99, -157, 605};

        int min = tab[0];
        int max = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            } else if (tab[i] < min) {
                min = tab[i];
            }
        }

        System.out.println("Najmniejsza wartość tablicy to: " + min);
        System.out.println("Największa wartość tablicy to: " + max);
    }
}