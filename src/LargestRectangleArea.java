import java.util.Stack;

public class LargestRectangleArea {

  /*  Your input: [2,1,5,6,2,3]
    Output: 10
 https://leetcode.com/problems/largest-rectangle-in-histogram/submissions/

    */
}

class Solution {
    public int largestRectangleArea(int[] heights) {
        return getMaxArea(heights);
    }

    public int getMaxArea(int[] heights) {
        int[] left = nsl(heights);
        int[] right = nsr(heights);

        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            maxArea = Math.max(maxArea, (right[i] - left[i] - 1) * heights[i]);
        }
        return maxArea;
    }

    public int[] nsl(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer>
                st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;

    }

    public int[] nsr(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer>
                st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            ans[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }
        return ans;

    }


}
