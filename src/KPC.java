import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class KPC {
    static String[] arr = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getKPC(s));
    }


    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> faith = getKPC(str.substring(1));
        ArrayList<String> ans = new ArrayList<>();
        String word = arr[str.charAt(0) - '0']; // str -> 123, '1' -> 1; '1' - '0' = 1
        for(int i = 0; i < word.length(); i++){
            for(String s: faith){
                ans.add(word.charAt(i) + s);
            }
        }
        return ans;
    }
}
