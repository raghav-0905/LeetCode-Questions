class Solution {
    public int rob(int[] nums) {
        int row = nums.length + 2;
        int col = (nums.length + 3) / 2;
        int[][] c = new int[row][col];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < col; j++) {
                c[i][j] = 0;
            }
        }
        for (int i = 2; i < row; i++){
            c[i][0]=0;
        }
        for(int i =2; i<row; i++){
            for(int j = 1; j<col; j++){
                c[i][j]=Math.max(c[i-1][j],(nums[i-2]+c[i-2][j-1]));
            }
        }
        return c[row - 1][col - 1];
    }
}