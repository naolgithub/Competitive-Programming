class Solution {
    // Directions for street types
    private final int[][][] directions = {
        {},
        {{0, -1}, {0, 1}},   // type 1: left-right
        {{-1, 0}, {1, 0}},   // type 2: up-down
        {{0, -1}, {1, 0}},   // type 3: left-down
        {{0, 1}, {1, 0}},    // type 4: right-down
        {{0, -1}, {-1, 0}},  // type 5: left-up
        {{0, 1}, {-1, 0}}    // type 6: right-up
    };
    private boolean dfs(int[][] grid, int row, int col, boolean[][] visited) {
        int m = grid.length, n = grid[0].length;
        
        if (row == m - 1 && col == n - 1) {
            return true;
        }

        visited[row][col] = true;

        for (int[] direction : directions[grid[row][col]]) {
            int newRow = row + direction[0], newCol = col + direction[1];

            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
                for (int[] opposite : directions[grid[newRow][newCol]]) {
                    if (newRow + opposite[0] == row && newCol + opposite[1] == col) {
                        if (dfs(grid, newRow, newCol, visited)) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
    public boolean hasValidPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        return dfs(grid, 0, 0, visited);
    }
}