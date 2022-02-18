import java.util.Arrays;
import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        String matchinIinput = "(a+b)+(c+d)";

        int[] arr = new int[]{5, 5, 3, 8, -2, 7};
        int[] ans = nextMaxRight(arr);
        Arrays.stream(ans).forEach(x -> System.out.print(x + " "));

        System.out.println(" ----------");
        int[] arr_1 = new int[]{1, 3, 5, 4, 1};
        int[] ans_1 = nsl(arr_1);
        Arrays.stream(ans_1).forEach(x -> System.out.print(x + " "));
        System.out.println("--- ngl --");

        int[] arr_2 = new int[]{3,1,2,3,4,2,2,1,0,3};
        int[] ans_2 = ngl(arr_2);
        Arrays.stream(ans_2).forEach(x -> System.out.print(x + " "));
        
        System.out.println(" ----------");
        String input = "[(a + b) + {(c + d) * (e / f)}]}";
        System.out.println("isMatching " + isMatching(matchinIinput));
        System.out.println("isBalancedBracket " + isBalancedBracket(input));

    }

    private static int[] ngl(int[] arr_2) {
        int n = arr_2.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i =0 ; i < n; i ++){
            while (!st.isEmpty() && arr_2[st.peek()] <= arr_2[i]) st.pop();
            span[i] = i - (st.isEmpty() ? -1 : st.peek());
            st.push(i);
        }
        return span;
    }

    //-1 1 3 3 -1
    private static int[] nsl(int[] arr) {

        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i]) st.pop();
            ans[i] = st.isEmpty() ? -1 : i;
            st.push(arr[i]);
        }
        return ans;
    }

    private static int[] nextMaxRight(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) st.pop();
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
