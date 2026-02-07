class Solution {
    static boolean canBloom(int[] bloom, int m, int k, int day){
        int l = 0;
        int r = 0;
        int n = bloom.length;
        while(r<n){
            if(bloom[r]>day){
                l=r+1;
            }else{
                int flowers = r-l+1;
                if(flowers==k){
                    m--;
                    l=r+1;
                };
            }
            if(m==0)break;
            r++;
        }
        return m == 0;
    }
    static int maxelem(int[] arr){
        int maxi = arr[0];
        for(int num : arr){
            maxi = Math.max(maxi,num);
        }
        return maxi;
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length)return -1;
        int low = 1;
        int high = maxelem(bloomDay);
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(canBloom(bloomDay,m,k,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}