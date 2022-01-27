public class Recursion {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("---- printDecreasing ----");
        printDecreasing(n);
        System.out.println("---- printIncreasing ----");
        printIncreasing(n);
        System.out.println("---- printBothWay ----");
        printBothWay(n);
        System.out.println("---- printBothWayOther ----");
        printBothWayOther(n, 1, n + 1);
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

    private static void printBothWay(int n) {
        if (n == 0) return;
        System.out.println(n);
        printBothWay(n - 1);
        System.out.println(n);
    }

    private static void printBothWayOther(int n, int j, int x) {
        if (j >= x) return;
        System.out.println(j);
        j++;
        printBothWayOther(n - 1, j, x);
        System.out.println(j - 1);
    }
}

