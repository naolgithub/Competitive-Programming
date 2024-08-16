class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
      
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        
        dp[0][0] = 1;
        
        // Fill row
        for (int col = 1; col < n; col++) {
            if (obstacleGrid[0][col] == 1) {
                dp[0][col] = 0; 
            } else {
                dp[0][col] = dp[0][col - 1]; 
            }
        }
        
        // Fill column
        for (int row = 1; row < m; row++) {
            if (obstacleGrid[row][0] == 1) {
                dp[row][0] = 0; 
            } else {
                dp[row][0] = dp[row - 1][0]; 
            }
        }
        
        // rest of the grid
        for (int row = 1; row < m; row++) {
            for (int col = 1; col < n; col++) {
                if (obstacleGrid[row][col] == 1) {
                    dp[row][col] = 0;
                } else {
                    dp[row][col] = dp[row - 1][col] + dp[row][col - 1]; 
                }
            }
        }
        
        return dp[m - 1][n - 1];
    }
}
