class Solution {
    public int longestOnes(int[] nums, int k) {
        int flipped = 0;
        int maxlen = 0;
        int l = 0, r = 0;
        int n = nums.length;
        while(r<n){
            if(nums[r]==0 && flipped<k){
                flipped++;
            }
            else if(nums[r]==0 && flipped==k){
                while(nums[l]!=0)l++;
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}