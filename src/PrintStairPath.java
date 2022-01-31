import java.util.Scanner;

public class PrintStairPath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        printStairPaths(num, "");
    }

    private static void printStairPaths(int num, String ans) {
        if (num <= 0) {
            if (num == 0) {
                System.out.println(ans);
            }
            return;
        }
        for (int i = 1; i <= 3; i++) {
            printStairPaths(num - i, ans + i);

        }
    }
}
