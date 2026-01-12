class Solution {
    public int maxSubArray(int[] nums) {
        int maximum = -10000;
        int sum = 0;
        for(int num: nums){
            sum+=num;
            maximum = Math.max(maximum,sum);
            if(sum<0)sum=0;
        }
        return maximum;
    }
}