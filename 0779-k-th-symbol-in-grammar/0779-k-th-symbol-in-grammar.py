class Solution:
    def kthGrammar(self, n: int, k: int) -> int:
        if n==1:
            return 0
        prevK=self.kthGrammar(n-1,(k+1)//2)
        
        if prevK==0:
            return 0 if k%2==1 else 1
        else:
            return 1 if k%2==1 else 0
       
        