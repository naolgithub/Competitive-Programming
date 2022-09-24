class Solution {
    // using Kadane's Algorithm solution
    // TC:O(N)
    // SC:O(1)
    public int maxSubArray(int[] nums) {
        
        int maxSum = nums[0];
        int currentSum=maxSum;
        // we have to start from index 1 since we have already assigned index 0
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(currentSum+nums[i],nums[i]);
            maxSum=Math.max(currentSum,maxSum); 
        }
     return maxSum;   
    }
}