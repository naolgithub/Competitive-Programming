class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:
        total = sum(nums)
        memo = [[None] * (2 * total + 1) for _ in range(len(nums))]
        return self.calculate(nums, 0, 0, target, memo, total)

    def calculate(self, nums, i, current_sum, S, memo, total):
        if i == len(nums):
            return 1 if current_sum == S else 0
        else:
            if memo[i][current_sum + total] is not None:
                return memo[i][current_sum + total]
            
            add = self.calculate(nums, i + 1, current_sum + nums[i], S, memo, total)
            subtract = self.calculate(nums, i + 1, current_sum - nums[i], S, memo, total)
            
            memo[i][current_sum + total] = add + subtract
            return memo[i][current_sum + total]
