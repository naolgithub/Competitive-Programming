class Solution:
    def fib(self, n: int) -> int:
        # # Recursion
        # if n<=1:
        #     return n
        # return self.fib(n-1)+self.fib(n-2)

        # #Top-down
        # memo={}
        # def fibo_helper(num):
        #     if num<=1:
        #         return num
        #     if num in memo:
        #         return memo[num]
        #     memo[num]=fibo_helper(num-1)+fibo_helper(num-2)
        #     return memo[num]
        # return fibo_helper(n)

        #Tabulation with 0(1) space
        if n<=1:
            return n
        prev2=0
        prev1=1
        for i in range(2,n+1):
            curr=prev2+prev1
            prev2=prev1
            prev1=curr
        return prev1 
        