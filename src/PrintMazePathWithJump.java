import java.util.Scanner;

public class PrintMazePathWithJump {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        printMazePaths(0, 0, row - 1, col - 1, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if (sr > dr || sc > dc) return;
        if (sr == dr && dc == sc) {
            System.out.println(psf);
            return;
        }
        //horizontal
        for (int i = 1; i <= dc; i++) {
            printMazePaths(sr, sc + i, dr, dc, psf + "h" + i);
        }
        //vertical
        for (int i = 1; i <= dr; i++) {
            printMazePaths(sr + i, sc, dr, dc, psf + "v" + i);
        }
        //diagonal
        for (int i = 1; i <= Math.min(dr, dc); i++) {
            printMazePaths(sr + i, sc + i, dr, dc, psf + "d" + i);
        }

    }
}
