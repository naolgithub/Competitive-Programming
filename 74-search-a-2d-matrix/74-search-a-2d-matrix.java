class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*
        We need to start with the greatest column and work our way to the left. This means that our first element
for comparison is matrix[0][c-1], where c is the number of columns.
       NOTE:Element may not be at the end of a row in the full matrix, but it is at an end of a row of a submatrix. The
same conditions apply. Element may not be at the start of a column in the full matrix,but it is at an start of a column of a submatrix              //1.WE START AT THE GREATEST COLUMN , IN THE FIST ROW
          //2.IF NOT WE WORK OUR WAY TO THE LEFT(WE DECREASE OUR VALUE OF COLUMN)
          //3.IF NOT WE WORK OUR WAY TO THE DOWN(WE INCREASE THE VALUE OF ROW SINCE WE STARTED FROM FIRST ROW)
        */
        
        
        
        //1.WE START AT THE GREATEST COLUMN , IN THE FIST ROW
        int row=0;
        int column=matrix[0].length-1;
        
        while(row<matrix.length && column>=0){
            if(matrix[row][column]==target){
                return true;
            }
            //2.IF NOT WE WORK OUR WAY TO THE LEFT(WE DECREASE OUR VALUE OF COLUMN)
            else if(matrix[row][column]>target){
                column--;
            }
            //3.IF NOT WE WORK OUR WAY TO THE DOWN(WE INCREASE THE VALUE OF ROW SINCE WE STARTED FROM FIRST ROW)
            else{
                row++;
            }
        }
        return false;
    }
}