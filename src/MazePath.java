import java.util.ArrayList;
import java.util.Scanner;

public class MazePath {
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
        if( sr > dr || sc > dc) return new ArrayList<>();
        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        //horizontal
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> horizontal = getMazePaths(sr, sc + 1, dr, dc);
        for(String s: horizontal) ans.add("h" + s);
        //vertical
        ArrayList<String> vertical = getMazePaths(sr + 1, sc, dr, dc);
        for(String s: vertical) ans.add("v" + s);
        return ans;
    }

}
