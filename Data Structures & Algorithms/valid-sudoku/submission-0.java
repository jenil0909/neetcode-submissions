class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Fixed: Matching your method call while keeping the char[][] type
        return validSudoku(board, 0, 0);
    }

    // Fixed: Changed parameter from int[][] to char[][] to match LeetCode input
    // Fixed: Changed digit from int to char to compare directly with the board
    public boolean isSafe(char[][] board, int row, int column, char digit){
        //row
        for (int i = 0; i < 9; i++){
                 if (i != column && board[row][i] == digit){
                return false;
            }
        }
        //column
        for (int i = 0; i < 9; i++){
            if (i != row && board[i][column] == digit){
                return false;
            }
        }
        //3*3 matrix
        int sr = row / 3 * 3;
        int sc = column / 3 * 3;
        
        for (int i = sr; i < sr + 3; i++){
            for (int j = sc; j < sc + 3; j++){
                // Fixed: Added condition to skip checking the current cell itself
                if ((i != row || j != column) && board[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }

    // Fixed: Changed parameter from int[][] to char[][]
    public boolean validSudoku(char[][] board, int row, int column){
        //base case
        if (row == 9 && column == 0){
            return true;
        }
        
        int nextRow = row; 
        int nextColumn = column + 1;
        if (column + 1 == 9){
            nextRow = row + 1;
            nextColumn = 0;
        }

        char current = board[row][column];
        
        if (current != '.') {
            // If the current cell has a number, check if it violates Sudoku rules
            if (!isSafe(board, row, column, current)) {
                return false;
            }
        }
        
    
        return validSudoku(board, nextRow, nextColumn);
    }
}
