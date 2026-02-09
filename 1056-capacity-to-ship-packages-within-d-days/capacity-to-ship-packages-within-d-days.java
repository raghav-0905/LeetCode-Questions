class Solution {
boolean canShip(int[] weights, int days, int capacity) {
    int daysUsed = 1;
    int currLoad = 0;

    for (int w : weights) {
        if (w > capacity) return false;

        if (currLoad + w > capacity) {
            daysUsed++;
            currLoad = 0;
        }
        currLoad += w;
    }

    return daysUsed <= days;
}

    int maxWeight(int[] weights){
        int maxw = 0;
        for(int weight : weights){
            maxw+=weight;
        }
        return maxw;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 1;
        int high = maxWeight(weights);
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(canShip(weights,days,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}