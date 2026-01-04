class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = s.length();
        int l = 0, r = -1;
        while(r<n-1){
            r++;
            int c = s.charAt(r);
            int pos = map.getOrDefault(c,-1);
            if(pos>=l)l=pos+1;
            length = Math.max(length,r-l+1);
            map.put(c,r);
        }
        return length;
    }
}