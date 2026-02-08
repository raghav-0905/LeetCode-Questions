class Solution {
    int maxelem(int[] nums){
        int maxi = 0;
        for(int num: nums){
            maxi = Math.max(maxi,num);
        }
        return maxi;
    }
    int divisum(int[] nums, int div){
        int sum = 0;
        for(int num: nums){
            sum += Math.ceilDiv(num,div);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = maxelem(nums);
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            int sum = divisum(nums,mid);
            if(sum<=threshold){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}