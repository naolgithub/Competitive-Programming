/*
https://leetcode.com/problems/frequency-of-the-most-frequent-element/discuss/2510222/Java-or-Sliding-Window-Solution-or-With-Easy-Explanation
*/
class Solution {
    public int maxFrequency(int[] nums, int k) {
      Arrays.sort(nums);
        int maxFrequency = 0;
        int leftPointer = 0, rightPointer = 0;
        long total = 0;
        while(rightPointer < nums.length){
            total += nums[rightPointer];
             while((long)nums[rightPointer]*(rightPointer - leftPointer + 1) > (total + k)){
                 total -= nums[leftPointer];
                 leftPointer++;
             }
            //now we have a valid window
            maxFrequency = Math.max(maxFrequency, (rightPointer - leftPointer + 1));
            rightPointer++;
        }
        return maxFrequency;
    }
}