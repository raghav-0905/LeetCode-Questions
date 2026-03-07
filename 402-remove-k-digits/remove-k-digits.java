class Solution {
    public static String removeKdigits(String num, int k) {
        int n = num.length();
        if(k==n)return "0";
        Stack<Integer> stack = new Stack<>();
        for(char c : num.toCharArray()){
            int number = c-'0';
            while(!stack.isEmpty() && stack.peek()>number && k>0){
                stack.pop();
                k--;
            }
            stack.push(number);
        }
        while(!stack.isEmpty() && k>0){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }
        while(!sb.isEmpty()  && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        return sb.isEmpty()?"0":sb.toString();
    }
}