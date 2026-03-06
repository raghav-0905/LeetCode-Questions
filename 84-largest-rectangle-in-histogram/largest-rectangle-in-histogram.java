class Solution {
    //basically har height index ke liye example in [2.1.5.6.2.3]
    // jab bhi iterate karre hai stack mei, we take that current height as the boundary
    // aur uske peechle mei just smaller elements ke liye max area calculate karenge
    //basically simulating what we were doing in that placement prep question of trapping rainwater but using stack
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() &&
            (i == n || heights[stack.peek()] >= heights[i])) {

            int height = heights[stack.pop()];
            int right = i;
            int left = stack.isEmpty() ? -1 : stack.peek();

            int width = right - left - 1;
            maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
    return maxArea;
    }
}