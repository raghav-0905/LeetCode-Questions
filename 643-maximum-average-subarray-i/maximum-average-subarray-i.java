class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = -10000;
        int n = nums.length;
        int[] prefix = new int[n+1];
        prefix[0]=0;
        int i = 0, j=1;
        for (j = 1; j < n+1 ; j++) {
            prefix[j] = prefix[j-1]+nums[j-1];
        }
        for(i=0,j=k;j<n+1;i++,j++){
            double temp = (double) (prefix[j] - prefix[i]) /k;
            avg = Math.max(avg,temp);
        }
        return avg;
    }
}