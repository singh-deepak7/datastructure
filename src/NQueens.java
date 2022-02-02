import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printNQueens(new int[n][n], "", 0);

    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if (row == chess.length) {
            System.out.println(qsf);
            return;
        }

        for (int col = 0; col < chess.length; col++) {
            if (isSafeToPlace() == true) {
                chess[row][col] = 1;
                printNQueens(chess, (qsf + row + "-" + col + ", "), row + 1;
                chess[row][col] = 0;
            }
        }

    }

    private static boolean isSafeToPlace() {
    }
}
