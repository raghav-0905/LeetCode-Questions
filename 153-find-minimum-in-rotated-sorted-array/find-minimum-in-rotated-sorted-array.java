class Solution {
    public static int findMin(int[] nums) {
        int low = 0;
        int high= nums.length -1;
        int pivot = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid>low && nums[mid]<nums[mid-1]){
                pivot = nums[mid];
                break;
            }else if(mid<high && nums[mid]>nums[mid+1]){
                pivot = nums[mid+1];
                break;
            }
            else if(nums[low]<=nums[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return pivot==-1?nums[0]:pivot;
    }
}