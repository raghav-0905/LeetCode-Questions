class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int[][] prefixsum = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) prefixsum[i][0] = 0;
        for (int j = 0; j < n + 1; j++) prefixsum[0][j] = 0;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                prefixsum[i][j] = mat[i - 1][j - 1] + prefixsum[i - 1][j] + prefixsum[i][j - 1] - prefixsum[i - 1][j - 1];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int left = Math.max(0,j-k)+1;
                int right = Math.min(n-1,j+k)+1;
                int up = Math.max(0,i-k)+1;
                int down = Math.min(m-1,i+k)+1;
                mat[i][j]=prefixsum[down][right]-prefixsum[up-1][right]-prefixsum[down][left-1]+prefixsum[up-1][left-1];
            }
        }
        return mat;
    }
}