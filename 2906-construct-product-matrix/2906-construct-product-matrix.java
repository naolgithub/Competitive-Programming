class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] prefix = new int[m][n];
        int[][] suffix = new int[m][n];
        int total = 1;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                prefix[i][j] = (int)total;
                total *= (grid[i][j] % 12345);
                total %= 12345;
            }
        }
        total = 1;
        for(int i = m - 1;i>=0;i--){
            for(int j = n - 1;j>=0;j--){
                suffix[i][j] = (int)total;
                total *= (grid[i][j]%12345);
                total %= 12345;
                grid[i][j] = ((prefix[i][j] * suffix[i][j]) % 12345);
            }
        }
        return grid;
    }
}