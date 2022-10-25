class Solution {
    public int longestSubarray(int[] nums) {
        // No Sliding window is needed
        int previousCount = 0;
        int currentCount = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) currentCount++;
            else {
        result = Math.max(result, currentCount + previousCount);
                previousCount = currentCount;
                currentCount = 0;
            }
        }
        result = Math.max(result, currentCount + previousCount);
        //if all elements of nums are ones, we must remove one element from nums;
        return result == nums.length ? result - 1 : result;
    }
}