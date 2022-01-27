public class Recursion {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("---- printDecreasing ----");
        printDecreasing(n);
        System.out.println("---- printIncreasing ----");
        printIncreasing(n);
        System.out.println("---- printBothway ----");
        printBothway(n);
    }

    private static void printDecreasing(int n) {
        if (n == 0) return;
        System.out.println(n);
        printDecreasing(n - 1);
    }

    private static void printIncreasing(int n) {
        if (n == 0) return;
        printIncreasing(n - 1);
        System.out.println(n);
    }

    private static void printBothway(int n) {
        if (n == 0) return;
        System.out.println(n);
        printBothway(n - 1);
        System.out.println(n);
    }
}

