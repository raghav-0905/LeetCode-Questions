class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        int indx = -1;
        for(int i = n-1; i>=0; i--){
            int number = num.charAt(i)-'0';
            if(number%2==0)continue;
            indx = Math.max(indx,i);
        }
        return num.substring(0,indx+1);
    }
}