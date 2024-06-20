class Solution {
    /*
    Recursion Continues Only for Land Cells: The DFS continues recursively for all neighboring cells, 
    but only if those cells are land in grid2. 
    If the DFS hits a water cell or boundary, it returns true to indicate no invalidation.
    If we are out of bounds or the cell is water in grid2, 
    it doesn't affect the validity of the sub-island check.
    */
    private boolean isSubIsland(int[][] grid1, int[][] grid2, int row, int col) {
        if (row < 0 || row >= grid2.length || col < 0 || col >= grid2[0].length || grid2[row][col] == 0) {
            return true;
        }
        if (grid2[row][col] == 1 && grid1[row][col] == 0) {
            return false;
        }
        
        // Mark this cell as visited in grid2
        grid2[row][col] = 0;
        
        boolean isConnectedFourDirectionally = true;
        isConnectedFourDirectionally = isSubIsland(grid1, grid2, row + 1, col) && isConnectedFourDirectionally; // down
        isConnectedFourDirectionally = isSubIsland(grid1, grid2, row - 1, col) && isConnectedFourDirectionally; // up
        isConnectedFourDirectionally = isSubIsland(grid1, grid2, row, col + 1) && isConnectedFourDirectionally; // right
        isConnectedFourDirectionally = isSubIsland(grid1, grid2, row, col - 1) && isConnectedFourDirectionally; // left
        
        return isConnectedFourDirectionally;
    }

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int numberOfSubIslands = 0;
        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[0].length; j++) {
                if (grid2[i][j] == 1) {
                    if (isSubIsland(grid1, grid2, i, j)) {
                        numberOfSubIslands++;
                    }
                }
            }
        }
        return numberOfSubIslands;
    }
}
