class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;

        int sum = 0;
        for (int num : nums) sum += num;

        // If target is outside possible range
        if (Math.abs(target) > sum) return 0;

        int offset = sum;
        int[][] dp = new int[n + 1][2 * sum + 1];

        // Base case: using 0 numbers, sum = 0
        dp[0][offset] = 1;

        for (int i = 1; i <= n; i++) {
            int val = nums[i - 1];
            for (int j = 0; j <= 2 * sum; j++) {
                if (dp[i - 1][j] != 0) {
                    dp[i][j + val] += dp[i - 1][j];
                    dp[i][j - val] += dp[i - 1][j];
                }
            }
        }

        return dp[n][target + offset];
    }
}
