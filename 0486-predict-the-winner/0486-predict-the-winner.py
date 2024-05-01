class Solution:
    def backtracking(self,take,left,right,playerOneScore,playerTwoScore,nums):
        if left>right or right<left:
            return playerOneScore>=playerTwoScore
        if take%2==0:
            return self.backtracking(take+1,left+1,right,playerOneScore+nums[left],playerTwoScore,nums) or self.backtracking(take+1,left,right-1,playerOneScore+nums[right],playerTwoScore,nums)
        return self.backtracking(take+1,left+1,right,playerOneScore,playerTwoScore+nums[left],nums) and self.backtracking(take+1,left,right-1,playerOneScore,playerTwoScore+nums[right],nums)
        
    def predictTheWinner(self, nums: List[int]) -> bool:
        return self.backtracking(0,0,len(nums)-1,0,0,nums)
        
        