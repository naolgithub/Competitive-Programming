class Solution {
    public int rob(int[] nums) {
        Map<Integer, Integer> memo = new HashMap();
        return robHelper(nums, nums.length - 1, memo);
    }

    private int robHelper(int[] nums, int index, Map<Integer, Integer> memo) {
        // Base cases
        if (index < 0) return 0;
        if (index == 0) return nums[0];
        
        // Check if result is already in memo
        if (memo.containsKey(index)) {
            return memo.get(index);
        }

        // Recurrence relation: either rob the current house or skip it
        int result = Math.max(robHelper(nums, index - 1, memo), 
                              nums[index] + robHelper(nums, index - 2, memo));
        
        // Store the result in memo
        memo.put(index, result);

        return result;
    }
}
