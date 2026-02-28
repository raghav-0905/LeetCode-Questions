class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || stack.isEmpty() || stack.peek()==')')stack.push(c);

            if(c==')' &&  stack.peek()=='('){
                int pop = stack.pop();
            }
        }
        return stack.size();
    }
}