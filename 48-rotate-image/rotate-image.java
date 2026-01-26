class Solution {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int i, j;
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<(n+1)/2;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }
}