class Solution {
    static int hourstaken(int[] arr, int k){
        int hours = 0;
        for(int num: arr){
            hours += Math.ceilDiv(num,k);
        }
        return hours;
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        Arrays.sort(piles);
        int high = piles[piles.length-1];
        int ans=1000000000;
        while(low<=high){
            int mid = low + (high-low)/2;
            int hours = hourstaken(piles,mid);
            if(hours>0 && hours<=h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}