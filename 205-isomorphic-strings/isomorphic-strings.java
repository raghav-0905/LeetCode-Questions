class Solution {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> leftToright = new HashMap<>();
        HashMap<Character,Character> rightToleft = new HashMap<>();
        int n = s.length();
        int i = 0;
        while(i<n){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(!leftToright.containsKey(c1) && !rightToleft.containsKey(c2)){
                leftToright.put(c1,c2);
                rightToleft.put(c2,c1);
            }else if(!leftToright.containsKey(c1) && rightToleft.containsKey(c2)){
                    return false;
            }else if(!rightToleft.containsKey(c2) && leftToright.containsKey(c1)){
                return false;
            }else if(leftToright.get(c1)==c2 && rightToleft.get(c2)==c1){

            }else{
                return false;
            }
            i++;
            }
        return true;
    }
}