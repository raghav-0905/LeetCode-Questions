class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        rotatearr(nums,0,nums.length-1);
        rotatearr(nums,0,k-1);
        rotatearr(nums,k,nums.length-1);
    }
    public void rotatearr(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }
}