class Solution {
    public List<String> letterCombinations(String digits) {
        return solve("",digits);
    }
    public List<String> solve(String up, String p){
        if(p.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = p.charAt(0) - '0';
        int i = (digit-2)*3;
        if(digit>7)i++;
        int len =  i+3;
        if(digit==7 || digit==9) len++;
        for(int index = i;index<len;index++){
            char c = (char)('a'+index);
            ans.addAll(solve(up+c,p.substring(1)));
        }
        return ans;

    }
}