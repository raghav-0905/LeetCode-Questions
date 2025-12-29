class Solution {
    public int rob(int[] nums) {
        int row = nums.length + 2;
        int[] dp = new int[row];
        for(int i = 2; i<row; i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-2]);
        }
        return dp[row-1];
    }
}