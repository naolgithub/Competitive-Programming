class Solution {
    private void capture(char[][] board, int row, int col) {
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != 'O') {
            return;
        }
        
        board[row][col] = 'T';
        
        capture(board, row + 1, col); // down
        capture(board, row - 1, col); // up
        capture(board, row, col + 1); // right
        capture(board, row, col - 1); // left
    }    
    public void solve(char[][] board) {
        
        int rows = board.length;
        int cols = board[0].length;
        
        // 1. (DFS) capture unsurronded regions (O -> T)
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == 'O' && (row == 0 || row == rows - 1 || col == 0 || col == cols - 1)) {
                    capture(board, row, col);
                }
            }
        }
        
        // 2. capture surrounded regions (O -> X)
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == 'O') {
                    board[row][col] = 'X';
                }
            }
        }
        
        // 3. uncapture unsurronded regions (T -> O)
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == 'T') {
                    board[row][col] = 'O';
                }
            }
        }
    }
    
}