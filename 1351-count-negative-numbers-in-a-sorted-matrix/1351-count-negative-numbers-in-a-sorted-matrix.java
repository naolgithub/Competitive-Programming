class Solution {
    public int countNegatives(int[][] grid) {
        //Using nested loop( brute force approach )
        //Time Complexity:O(N^2)
        //Space Complexity:O(1)
        int counter=0;
        for(int row=0;row<grid.length;row++){
            for(int column=0;column<grid[row].length;column++){
                if(grid[row][column]<0) counter++;
            }
        }
        return counter==0 ? 0 : counter;
    }
}