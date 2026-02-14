//two pointer... count primitive length using kadane type approach
//add count when ( subtract when ). When count=0 it's balanced thus add to builder
// restart from ahead start=end+1
class Solution {
    public String removeOuterParentheses(String s) {
        int start = 0, end = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while(end<s.length()){
            if(s.charAt(end)=='(')count++;
            else count--;

            if(count==0){
                sb.append(s.substring(start+1,end));
                start = end+1;
            }
            end++;
        }
        return sb.toString();
    }
}