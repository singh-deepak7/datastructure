import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<String, Integer> map;

    public int combinationCount(String s) {
        map = new HashMap<>();
        fillMap(s);
        int count = 0;
        for (int i : map.values()) {
            count += i;
        }
        System.out.println(map);
        return count;
    }

    public void fillMap(String s) {
        if (s.length() == 0)
            return;
        // System.out.println(s);
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            str += s.charAt(i);
            if (!map.containsKey(str)) {
                map.put(str, str.length());
            }
            fillMap(s.substring(i + 1));
            fillMap(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "test";

        //solution main = new solution();
       // System.out.println(main.combinationCount("test"));
    }
}
