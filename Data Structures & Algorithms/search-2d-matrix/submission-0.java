class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean sk = true;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0;i<m && sk;i++){

            for (int j = 0; j<n && sk;j++){
                if(matrix[i][j] > target)  sk = false;
                if(matrix[i][j]==target)
                return true;
            }
            
        }
        return false;
    }
}
