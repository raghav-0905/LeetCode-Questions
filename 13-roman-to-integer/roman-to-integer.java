class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int n = s.length();
        int ans = 0;
        int i = n-2;
        int j = n-1;
        ans+=map.get(s.charAt(j));
        while(i>=0){
            int l = map.get(s.charAt(i));
            int r = map.get(s.charAt(j));
            if(l<r){
                ans-=l;
            }else{
                ans+=l;
            }
            i--;
            j--;
        }
        return ans;
    }

}