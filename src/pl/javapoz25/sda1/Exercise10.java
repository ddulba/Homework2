package pl.javapoz25.sda1;

public class Exercise10 {

    public static boolean isModulo (int[] testNumbers, int modulo) {

        boolean isCorrect = true;

        for (int numbers : testNumbers) {
            int myModulo = Exercise9.alternativeModulo(numbers, modulo);
            int originalModulo = numbers % modulo;

            if (myModulo != originalModulo) {
                isCorrect = false;
                break;
            }
        }
        return isCorrect;
    }
}
