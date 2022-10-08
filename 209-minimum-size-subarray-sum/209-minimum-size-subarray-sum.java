class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int windowStart=0;
        int windowSum=0;
        int minLengthSoFar=Integer.MAX_VALUE;
        for(int windowEnd=0;windowEnd<nums.length;windowEnd++){
            // grow the window
            windowSum+=nums[windowEnd];
            while(windowSum>=target){
                int currentLength=windowEnd-windowStart+1;
                minLengthSoFar=Math.min(minLengthSoFar,currentLength);
                windowSum-=nums[windowStart];
                windowStart++;
            }
        }
        return (minLengthSoFar==Integer.MAX_VALUE)? 0 :minLengthSoFar; 
    }
}