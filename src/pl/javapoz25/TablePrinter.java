package pl.javapoz25;

public class TablePrinter {

    public static void printTable(int[] tab) {

        for (int elementOfTable : tab) {
            System.out.print("[" + elementOfTable + "] ");
        }
        System.out.print("\n");
    }
}