class Solution {
    public int binarySearch(int[] arr, int low, int high, int target){
        if(low>high){
            return -1;
        }
        int mid = low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return binarySearch(arr,mid+1,high,target);
        }else{
            return binarySearch(arr,low,mid-1,target);
        }

    }
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for(int i=0; i<numbers.length-1;i++){
            int j=binarySearch(numbers,i+1,numbers.length-1,target-numbers[i]);
            if(j!=-1){
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }
        }
        return ans;

    }
}