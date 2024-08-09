class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        
        for (int num : nums) {
            totalSum += num;
        }

        if (totalSum % 2 != 0) {
            return false;
        }

        int target = totalSum / 2;
        int n = nums.length;

        boolean[] dp = new boolean[target + 1];
        dp[0] = true; 

        for (int num : nums) {
            for (int t = target; t >= num; t--) {
                dp[t] = dp[t] || dp[t - num];
            }
        }

        return dp[target];
    }
}
