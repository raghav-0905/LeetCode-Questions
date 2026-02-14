class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                int freq =map.get(c);
                map.put(c,freq+1);
            }
        }
        for(char c : t.toCharArray()){
            if(!map.containsKey(c))return false;
            if(map.get(c)==0)return false;
            int freq =map.get(c);
            map.put(c,freq-1);
        }
        return true;
    }
}