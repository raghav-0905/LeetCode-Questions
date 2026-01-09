class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int l = 0, r = 0, n = nums.length;
        int len = n+1;
        while(r<n){
            sum+=nums[r];
            if(sum>=target){
                while(sum-nums[l]>=target && l<r){
                    sum-=nums[l++];
                }
                len = Math.min(len,r-l+1);
            }
            r++;
        }
        if(len==n+1)return 0;
        return len;
    }
}