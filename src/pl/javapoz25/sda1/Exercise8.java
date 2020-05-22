package pl.javapoz25.sda1;

public class Exercise8 {

    public static boolean isArithmeticSeries (int[] testSeries) {

        if (testSeries.length < 2) {
            System.out.println("Ciąg jest za krótki");
        }

        boolean isSeries = true;
        int correctDiff = (testSeries[testSeries.length - 1] - testSeries[0]) / (testSeries.length - 1);

        for (int i = 1; i < testSeries.length; i++) {
            int r = testSeries[i] - testSeries[i - 1];
            if (r != correctDiff) isSeries = false;
        }

        return isSeries;
    }
}
