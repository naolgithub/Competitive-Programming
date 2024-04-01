class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        
        int[][] prefix = new int[grid.length][grid[0].length];
        int[][] suffix = new int[grid.length][grid[0].length];
        int product = 1;
        //Take modulo of every grid[i][j] and product 
        //while iterating through elements
        
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                prefix[i][j] = (int)product;
                
                grid[i][j]=grid[i][j]%12345;
                
                product *= grid[i][j];
                
                product %= 12345;
            }
        }
        product = 1;
        for(int i = grid.length - 1;i>=0;i--){
            for(int j = grid[0].length - 1;j>=0;j--){
                suffix[i][j] = (int)product;
                
                grid[i][j]=grid[i][j]%12345;
                
                product *= grid[i][j];
                
                product %= 12345;
                grid[i][j] = ((prefix[i][j] * suffix[i][j]) % 12345);
            }
        }
        return grid;
    }
}