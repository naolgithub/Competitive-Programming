class Solution:
    def numberOfSteps(self, num: int) -> int:
        #Recursive approach
        # def steps(num,count):
        #     if num==0:
        #         return count
        #     if num%2==0:
        #         return steps(num//2,count+1)
        #     if num%2==1:
        #         return steps(num-1,count+1)
        # return steps(num,0)
        #tc:log2N sc:log2N
        # similar to (count zeros) of kunal kushwaha
        # 14/2=7,count=1
        # 7-1=6,count=2
        # 6/2=3,count=3
        # 3-1=2,count=4
        # 2/2=1,count=5
        # 1/2=0,count=6

        #iterative approach
        #tc:0(logN), sc:0(1)
        count_zero=0
        while num>0:
            if num%2==0:
                num//=2
            else:
                num-=1
            count_zero+=1
        return count_zero
