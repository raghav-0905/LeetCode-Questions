class Solution {
    public static int  missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            int check = nums[i];
            if(check<n && nums[check]!=nums[i]){
                int temp = nums[check];
                nums[check] = nums[i];
                nums[i] = temp;
            }else {
                i++;
            }
        }
        for (i = 0; i< n ; i++){
            if(nums[i]!=i)break;
        }
        return i;
    }
} 