import java.util.Scanner;

public class FloodFill_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill_1(arr, 0, 0, "");
    }

    // asf -> answer so far
    public static void floodfill_1(int[][] maze, int sr, int sc, String asf) {
        if (sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc] == 1) return;
        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(asf);
            return;
        }
        int[][] dirns = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        String[] dirname = {"t", "l", "d", "r"};
        maze[sr][sc] = 1;
        for (int i = 0; i < dirns.length; i++) {
            floodfill_1(maze, sr + dirns[i][0], sc + dirns[i][1], asf + dirname[i]);
        }
        maze[sr][sc] = 0;

    }
}
