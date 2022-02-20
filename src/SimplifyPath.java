import java.util.Stack;

public class SimplifyPath {
/*
    Your input "/home/"
    Output "/home"
    https://leetcode.com/problems/simplify-path/submissions/

    */
}


class Solution3 {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        for (String s : path.split("/")) {
            if (s.length() > 0 && !s.equals(".")) {
                if (s.equals("..")) {
                    if (!st.isEmpty()) st.pop();
                } else st.push(s);
            }
        }
        if (st.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        for (String s : st) {
            sb.append("/" + s);
        }
        return sb.toString();

    }
}
