class Solution {
    public int minStartValue(int[] nums) {
        //Hint:Find the minimum prefix sum.
        /*
        To solve this question, we need to find the Minimum Prefix Sum <= 0 ending at each index.
        At an index i:
        1.prefixSum = Sum of first i elements.
        2.To keep track of the minimum prefix sum, we use minVal. It is initially assigned to zero so that we can find the minimum prefix sum <= 0.
        
        Minimum Positive startValue will be 1 - Minimum Prefix Sum as this will ensure that the prefix sum is always >= 1 at every index of the input array.
        */

        int minValue=0;
        int prefixSum=0;
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            // Find the minimum prefix sum which is <= zero, as it will help us to find the lowest negative value.
            minValue=Math.min(minValue,prefixSum);
        }
        return 1-minValue;
    }
}