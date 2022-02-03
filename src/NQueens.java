import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printNQueens(new int[n][n], "", 0);

    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if (row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }

        for (int col = 0; col < chess.length; col++) {
            if (isSafeToPlace(chess, row, col) == true) {
                chess[row][col] = 1;
                printNQueens(chess, (qsf + row + "-" + col + ", "), row + 1);
                chess[row][col] = 0;
            }
        }

    }

    private static boolean isSafeToPlace(int[][] chess, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                // diagonal check - major diff is same, minor sum is same
                if ((i + j == r + c || (i - j == r - c)) && chess[i][j] == 1) return false;
                if (chess[i][c] == 1) return false;
            }
        }
        return true;
    }
}
