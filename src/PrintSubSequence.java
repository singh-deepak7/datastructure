import java.util.Scanner;

public class PrintSubSequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printSS(str, "");
    }

    private static void printSS(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        printSS(str.substring(1), ans + str.charAt(0));
        printSS(str.substring(1), ans);
    }
}
