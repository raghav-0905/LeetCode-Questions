class Solution {
    static boolean isPal(String s, int l, int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
    public static int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j = n-1; j>=i; j--){
                if(isPal(s,i,j))count++;
            }
        }
        return count;
    }
}