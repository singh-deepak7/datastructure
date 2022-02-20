import java.util.Stack;

public class CanSeePersonCount {

  /*  Your input [10,6,8,5,11,9]
    Output [3,1,2,1,1,0]*/

    //https://leetcode.com/problems/number-of-visible-people-in-a-queue/
}


class Solution2 {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int[] ans = new int[n];
        for(int i = n-1; i >= 0; i --){
            int pc = 0;
            while(!st.isEmpty() && st.peek() < heights[i]){
                st.pop();
                pc++;
            }
            ans[i] = pc + (st.isEmpty() ? 0 : 1);
            st.push(heights[i]);
        }
        return ans;

    }
}