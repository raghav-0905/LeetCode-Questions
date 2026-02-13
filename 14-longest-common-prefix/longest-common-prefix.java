class Solution {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        int indx = 0;
        boolean br = true;
        while(indx<strs[0].length() && br) {
            prefix.append(strs[0].charAt(indx));
            for (int i = 1; i < strs.length; i++) {
                int prelen = prefix.length();
                String str = strs[i];
                if(prelen>str.length()){
                    br=false;
                    prefix.deleteCharAt(prelen - 1);
                    break;
                }
                String sub = str.substring(0, prelen);
                if (!sub.contentEquals(prefix)) {
                    br=false;
                    prefix.deleteCharAt(prelen - 1);
                    break;
                }
            }
            indx++;
        }
        return prefix.toString();
    }
}