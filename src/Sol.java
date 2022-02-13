import java.util.Arrays;

public class Sol {

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10, 15, 20}));

    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return rec(cost, new int[n], n);
    }

    private static int rec(int[] cost, int[] dp, int N) {
        for (int i = 0; i < N; i++) {
            if (i < 2) {
                dp[i] = cost[i];
                continue;
            } else {
                dp[i] = cost[i] + Math.min(cost[i - 1], cost[i - 2]);
            }

        }

        return Math.min(dp[N - 1], dp[N - 2]);
    }

}
