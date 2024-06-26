class Solution {
    private int[][] directions = {
        {-1, -1}, {-1, 0}, {-1, 1},{0, -1},{0, 1},{1, -1}, {1, 0}, {1, 1}
    };
    private void dfs(char[][] board, int row, int col) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != 'E') {
            return;
        }
        
        int mineCount = countMines(board, row, col);
        
        if (mineCount > 0) {
            board[row][col] = (char)(mineCount + '0');  
        } else {
            board[row][col] = 'B';  
            for (int[] direction : directions) {
                dfs(board, row + direction[0], col + direction[1]);
            }
        }
    }
    
    private int countMines(char[][] board, int row, int col) {
        int count = 0;
        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length && board[newRow][newCol] == 'M') {
                count++;
            }
        }
        return count;
    }    
    public char[][] updateBoard(char[][] board, int[] click) {
        int row = click[0];
        int col = click[1];
        
        if (board[row][col] == 'M') {
            board[row][col] = 'X'; 
        } else {
            dfs(board, row, col);
        }
        
        return board;
    }
}
