class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] alphabet = new int[26];
        for(int i=0; i<sentence.length();i++){
            char c = sentence.charAt(i);
            int index = c-'a';
            alphabet[index]++;
        }
        for(int i: alphabet){
            if(i<1)return false;
        }
        return true;
    }
}