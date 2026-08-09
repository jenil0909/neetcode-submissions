class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int n = matrix.length;
        int m = matrix[0].length;
    int left = 0;
int right = n * m - 1;


        while (left<=right){
            int mid = left + (right - left) / 2;
            int row = mid / m;
            int col = mid % m;
            int midVal = matrix[row][col];

            if (midVal == target) return true;

            if (target>midVal){
                left = mid + 1;
            }
            if (target < midVal){
                right= mid-1;
            }
        }
return false;
    }
}
