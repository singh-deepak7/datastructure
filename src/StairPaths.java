import java.util.ArrayList;
import java.util.Scanner;

public class StairPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(getStairPaths(num));

    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n < 0) return new ArrayList<>();
        if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int j = 1; j <= 3; j++) {
            ArrayList<String> faith = getStairPaths(n - j);
            for (String s : faith) {
                ans.add(j + s);
            }
        }
        return ans;
    }
}
