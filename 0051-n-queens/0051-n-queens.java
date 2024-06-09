class Solution { 
    private void distinctBoardConfiguration(boolean[][] board,List<List<String>> distinctSolutions) {
        List<String> list=new ArrayList();
        for (boolean[] row : board) {
            StringBuilder sb=new StringBuilder();
            for (boolean element : row) {
                if (element) {
                    // System.out.print("Q");
                    sb.append("Q");
                } else {
                    // System.out.print(".");
                    sb.append(".");
                }
            }
            // System.out.println();
            list.add(sb.toString());
        }
        distinctSolutions.add(list);
    }    
    private boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            // if board[i][col]==true OR
            // (if there is a queen there) return false
            // hence it is not safe to place the queen.
            if (board[i][col]) {
                return false;
            }
        }
        // check diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        // check diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }    
    private void solveQueens(boolean[][] board, int row,List<List<String>> distinctSolutions) {
        if (row == board.length) {
            distinctBoardConfiguration(board,distinctSolutions);
            return;
            // System.out.println();
            // return 1;
        }
        // placing the queen and checking for every row and column
        // int count = 0;
        for (int col = 0; col < board[0].length; col++) {
            // place the queen if it is safe
            if (isSafe(board, row, col)) {
                // mark the board as true(queen placed)
                board[row][col] = true;
                solveQueens(board, row + 1,distinctSolutions);
                // unmark the board(backtrack) as false(queen removed)
                board[row][col] = false;
            }
        }
        // return count;
    }    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> distinctSolutions=new ArrayList();
        boolean[][] chessBoard=new boolean[n][n];
        solveQueens(chessBoard,0,distinctSolutions);
        return distinctSolutions;
    }
}