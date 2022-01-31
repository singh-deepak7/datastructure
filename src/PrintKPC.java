import java.util.Scanner;

public class PrintKPC {
    static String[] arr = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printKPC(s, "");

    }

    private static void printKPC(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        int word = str.charAt(0) - '0';
        for (int i = 0; i < arr[word].length(); i++) {
            printKPC(str.substring(1), ans + arr[word].charAt(i));
        }

    }
}
