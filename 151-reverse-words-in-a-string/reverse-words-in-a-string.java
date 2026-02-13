class Solution {
    public static String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        int n = words.length;
        StringBuilder ans = new StringBuilder();
        int j = n-1;
        while(j>=0) {
            if (words[j].isEmpty()) {
                j--;
            }
            else {
                ans.append(words[j]);
                ans.append(" ");
                j--;
            }
        }
        return ans.toString().trim();
    }
}