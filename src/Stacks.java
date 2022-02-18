import java.util.Arrays;
import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        String matchinIinput = "(a+b)+(c+d)";

        int[] arr = new int[]{5, 5, 3, 8, -2, 7};
       int [] ans = nextMaxRight(arr);
        Arrays.stream(ans).forEach(x -> System.out.print(x + " "));


        String input = "[(a + b) + {(c + d) * (e / f)}]}";
        System.out.println("isMatching " + isMatching(matchinIinput));
        System.out.println("isBalancedBracket " + isBalancedBracket(input));

    }

    private static int[] nextMaxRight(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while( !st.isEmpty() && st.peek() <= arr[i]) st.pop();
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

    private static boolean isMatching(String input) {

        Stack<Character> st = new Stack();
        for (char c : input.toCharArray()) {
            if (c == ')') {
                if (st.peek() == '(') return true;
                while (st.peek() != '(') st.pop();
            } else {
                st.push(c);
            }
        }
        return false;
    }

    private static boolean isBalancedBracket(String input) {

        Stack<Character> st = new Stack();
        for (char c : input.toCharArray()) {
            // opening
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            }

            // closing
            else if (c == ')') {
                if (st.isEmpty() || st.peek() != '(') return false;
                st.pop();
            } else if (c == ']') {
                if (st.isEmpty() || st.peek() != '[') return false;
                st.pop();
            } else if (c == '}') {
                if (st.isEmpty() || st.peek() != '{') return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }


}
