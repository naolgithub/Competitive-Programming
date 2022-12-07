class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowStart=0;
        int max=Integer.MIN_VALUE;
        int currentSum=0;
        for(int windowEnd=0;windowEnd<nums.length;windowEnd++){
            currentSum+=nums[windowEnd];
            if(windowEnd-windowStart+1==k){
                max=Math.max(max,currentSum);
                currentSum-=nums[windowStart];
                windowStart++;
            }
        }
        return (double)max/k;
    }
}