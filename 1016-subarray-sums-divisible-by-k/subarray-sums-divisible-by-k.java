class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int prefix = 0;
        int remainder=-1;
        int freq = -1;
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int num : nums){
            prefix+=num;
            remainder=prefix%k;
            if(remainder<0)remainder+=k;
            if(remainder==0)count++;
            freq = map.getOrDefault(remainder,0);
            count+=freq;
            map.put(remainder,freq+1);
        }
        return count;
    }
}