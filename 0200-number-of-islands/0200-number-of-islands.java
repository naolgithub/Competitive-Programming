class Solution {
    private void dfs(char[][] grid, int i, int j) {
        
        // Check for out-of-bounds or if the cell is water ('0')
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        
        // Mark visited cell to '0'/ (water)
        grid[i][j] = '0';
        
        // dfs in all 4 directions
        dfs(grid, i + 1, j); // down
        dfs(grid, i - 1, j); // up
        dfs(grid, i, j + 1); // right
        dfs(grid, i, j - 1); // left
    }
    public int numIslands(char[][] grid) {
        int numberOfIslands=0;
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    numberOfIslands++;
                }
            }
        }
        return numberOfIslands;
    }
}