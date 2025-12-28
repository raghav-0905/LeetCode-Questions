class Solution {
public boolean canJump(int[] nums) {
        int furthest=0;
        for (int i = 0; i < nums.length; i++) {
            int maxjump = nums[i];
            if(i+maxjump>=nums.length-1) return true;
            while(nums[i+maxjump]==0 && maxjump>0){
                maxjump--;
            }
            furthest = Math.max(i + maxjump, furthest);
            if(furthest==i) return false;
        }
        return true;
    }
}