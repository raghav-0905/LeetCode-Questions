class Solution {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int asteroid : asteroids){
            if(stack.isEmpty()){
                stack.push(asteroid);
            }else if(stack.peek()<0 || asteroid>0){
                stack.push(asteroid);
            }
            else{
                int destroy = Math.abs(asteroid);
                boolean lose = false;
                while(!stack.isEmpty() && stack.peek()>0){
                    if(destroy<stack.peek()){
                        lose=true;
                        break;
                    }else if(destroy==stack.peek()){
                        lose = true;
                        int lost = stack.pop();
                        break;
                    }
                    else{
                        int lost = stack.pop();
                    }
                }
                if(!lose)stack.push(asteroid);
            }
        }
        int[] ans = new int[stack.size()];
        int j = stack.size()-1;
        while(!stack.isEmpty()){
            ans[j--]=stack.pop();
        }
        return ans;
    }
}