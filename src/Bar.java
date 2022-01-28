import java.util.Scanner;

public class Bar {

    public static void main(String args[]) {
        System.out.println("Enter number of columns:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = 0;
        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
        }
        System.out.println("Max " + max);
        for (int i = max; i >= 1; i--) {
            for (int b : arr) {
                if (b >= i) System.out.print("*\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
}
