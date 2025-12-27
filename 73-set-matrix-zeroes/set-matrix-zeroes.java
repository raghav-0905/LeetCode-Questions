class Solution {
    public void rowcolzero(int[][] matrix, int row, int col, boolean isrow){
        if(!isrow){
            for(int i = 0; i<matrix.length; i++){
                matrix[i][col]=0;
            }
        }else{
            for(int j = 0; j<matrix[0].length; j++){
                matrix[row][j]=0;
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        for(int i=0; i<matrix.length; i++){
            if(row[i]){
                rowcolzero(matrix,i,0,true);
            }
        }
        for(int j=0; j<matrix[0].length; j++){
            if(col[j]){
                rowcolzero(matrix,0,j,false);
            }
        }
    }
}