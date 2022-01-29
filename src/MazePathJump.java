import java.util.ArrayList;
import java.util.Scanner;

public class MazePathJump {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" Row: ");
        int dr = scn.nextInt();
        System.out.println(" Column: " );
        int dc = scn.nextInt();
        System.out.println(getMazePaths(0,0,dr-1,dc-1));

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();
        //horizontal
        for(int i = 1; i <= dc-sc; i ++) {
            ArrayList<String> horizontal = getMazePaths(sr, sc + i, dr, dc);
            for (String s : horizontal) ans.add("h" + i + s);
        }
        //vertical
        for(int i = 1; i <= dr-sr; i ++) {
            ArrayList<String> vertical = getMazePaths(sr + i, sc, dr, dc);
            for (String s : vertical) ans.add("v" + + i + s);
        }
        //diagonal
        for(int i = 1; i <= dr-sr && i <= dc-sc; i ++) {
            ArrayList<String> diagonal = getMazePaths(sr + i, sc + i, dr, dc);
            for (String s : diagonal) ans.add("d" +i +s);
        }
        return ans;
    }

}
