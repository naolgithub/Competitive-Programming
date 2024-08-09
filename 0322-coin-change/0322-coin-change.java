public class Solution {
    public int coinChange(int[] coins, int amount) {
        // Create a DP array to store the minimum coins needed for each amount
        int[] dp = new int[amount + 1];

        // Initialize the DP array with a value larger than the possible number of coins
        Arrays.fill(dp, amount + 1);

        // Base case: 0 coins needed to make amount 0
        dp[0] = 0;

        // Build up the DP array from 1 to amount
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // If dp[amount] is still amount + 1, it means it's not possible to make that amount
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
