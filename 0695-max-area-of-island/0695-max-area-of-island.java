class Solution {
    private int dfs(int[][] grid, int row, int col) {
        // Check bounds and if the current cell is land
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0) {
            return 0;
        }

        // Mark the current cell as visited by setting it to 0
        grid[row][col] = 0;

        int numberOfCells = 1;  // Current cell counts as 1

        // Explore all 4 possible directions
        numberOfCells += dfs(grid, row + 1, col);  // Down
        numberOfCells += dfs(grid, row - 1, col);  // Up
        numberOfCells += dfs(grid, row, col + 1);  // Right
        numberOfCells += dfs(grid, row, col - 1);  // Left

        return numberOfCells;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int maximumIslandArea = 0;

        // Traverse each cell in the grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {  // Found an island part
                    int currentIslandArea = dfs(grid, i, j);
                    maximumIslandArea = Math.max(maximumIslandArea, currentIslandArea);  // Update the maximum area
                }
            }
        }

        return maximumIslandArea;
    }

}