class Solution {
    private boolean backtracking(int take, int left, int right,int playerOneScore,int playerTwoScore,int[] nums){
        if(left>right || right<left) return playerOneScore>=playerTwoScore;
        if(take%2==0){
            return backtracking(take+1,left+1,right,playerOneScore+nums[left],playerTwoScore,nums)||backtracking(take+1,left,right-1,playerOneScore+nums[right],playerTwoScore,nums);
        }
        return backtracking(take+1,left+1,right,playerOneScore,playerTwoScore+nums[left],nums) && backtracking(take+1,left,right-1,playerOneScore,playerTwoScore+nums[right],nums);
    }
    public boolean predictTheWinner(int[] nums) {
        return backtracking(0,0,nums.length-1,0,0,nums);
    }
}