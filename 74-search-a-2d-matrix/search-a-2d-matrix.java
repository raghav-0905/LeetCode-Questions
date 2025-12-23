class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=0, m = matrix.length-1, n=matrix[0].length-1;
        int low = 0, high = m, left = 0, right = n;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(matrix[mid][0]<=target && matrix[mid][n]>=target){
                while(left<=right){
                    int middle = left + (right-left)/2;
                    if(matrix[mid][middle]==target){
                        return true;
                    }else if(matrix[mid][middle]>target){
                        right = middle-1;
                    }else{
                        left = middle+1;
                    }
                }
                return false;
            }
            else if(matrix[mid][0]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
    
}