class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,0,target);
    }
    public int solve(int[] nums, int index, int target){
        if(index==nums.length){
            if(target==0)return 1;
            return 0;
        }
        return solve(nums,index+1,target-nums[index])+solve(nums,index+1,target+nums[index]);
    }
}