class Solution {
    // using Kadane's Algorithm---dynamic programming
    // TC:O(N)
    // SC:O(N)
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currentSum=maxSum;
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i]+currentSum,nums[i]);
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}