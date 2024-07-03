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

    public boolean hasValidPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        return dfs(grid, 0, 0, visited);
    }

    private boolean dfs(int[][] grid, int x, int y, boolean[][] visited) {
        int m = grid.length, n = grid[0].length;
        
        if (x == m - 1 && y == n - 1) {
            return true;
        }

        visited[x][y] = true;

        for (int[] direction : directions[grid[x][y]]) {
            int nx = x + direction[0], ny = y + direction[1];

            if (nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny]) {
                for (int[] opposite : directions[grid[nx][ny]]) {
                    if (nx + opposite[0] == x && ny + opposite[1] == y) {
                        if (dfs(grid, nx, ny, visited)) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

}