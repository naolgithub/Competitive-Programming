class Solution:
    def canPartition(self, nums: List[int]) -> bool:
        total_sum = sum(nums)

        # If the total sum is odd, it's not possible to partition it into two equal subsets
        if total_sum % 2 != 0:
            return False

        target = total_sum // 2
        n = len(nums)

        # DP array to track possible sums
        dp = [False] * (target + 1)
        dp[0] = True  # Zero sum is always possible

        for num in nums:
            # Iterate backward to avoid overwriting the dp array
            for t in range(target, num - 1, -1):
                dp[t] = dp[t] or dp[t - num]

        return dp[target]
