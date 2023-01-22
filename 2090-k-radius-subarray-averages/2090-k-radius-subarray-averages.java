class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] result = new int[nums.length];
        long currentSum = 0;
        int windowStart=0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            if (windowEnd < k) result[windowEnd] = -1;            
            currentSum += nums[windowEnd];
            if (windowEnd >= 2*k) {
                result[windowEnd - k] = (int)(currentSum / (2*k + 1));
                currentSum -= nums[windowStart++];
            }
			if (windowEnd >= nums.length - k) result[windowEnd] = -1;
        }
        return result;
    }
}