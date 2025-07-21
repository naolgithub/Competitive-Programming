class Solution:
    def fib(self, n: int) -> int:
        # # Recursion
        # if n<=1:
        #     return n
        # return self.fib(n-1)+self.fib(n-2)

        #Top-down
        memo={}
        def fibo_helper(num):
            if num<=1:
                return num
            if num in memo:
                return memo[num]
            memo[num]=fibo_helper(num-1)+fibo_helper(num-2)
            return memo[num]
        return fibo_helper(n)
        