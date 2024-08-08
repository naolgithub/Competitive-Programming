class Solution:
    def __init__(self):
        self.memo = {}

    def climbStairs(self, n: int) -> int:
        if n in self.memo:
            return self.memo[n]
        if n == 1:
            return n
        if n == 2:
            return n
        result = self.climbStairs(n - 1) + self.climbStairs(n - 2)
        self.memo[n] = result
        return result
