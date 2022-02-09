/*
You are climbing a staircase. It takes n steps to reach the top.

        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



        Example 1:

        Input: n = 2
        Output: 2
        Explanation: There are two ways to climb to the top.
        1. 1 step + 1 step
        2. 2 steps

        https://leetcode.com/problems/climbing-stairs/
        */

public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }

    public static int climbStairs(int n) {
        return getSteps(n, new int[n + 1]);

    }

    public static int getSteps(int N, int[] dp) {
        for (int n = 0; n <= N; n++) {
            if (n <= 1) {
                dp[n] = 1;
                continue;
            }
            dp[n] = dp[n - 1] + dp[n - 2];
        }
        return dp[N];

    }
}
