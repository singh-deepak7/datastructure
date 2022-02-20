import java.util.Stack;

public class AsteroidCollision {

  /*  Your input [5,10,-5]
    Output [5,10]

https://leetcode.com/problems/asteroid-collision/submissions/
    */
}

class Solution1 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int i : asteroids) {
            if (i > 0) {
                st.push(i);
            } else {
                while (!st.isEmpty() && st.peek() > 0 && -i > st.peek()) st.pop();
                if (st.isEmpty() || st.peek() < 0) st.push(i);
                if (st.peek() == -i) st.pop();

            }
        }
        int s = st.size();
        int i = 0;
        int[] ans = new int[s];
        for (int x : st) {
            ans[i++] = x;
        }
        return ans;
    }
}
