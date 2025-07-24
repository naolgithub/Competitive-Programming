class Solution:
    def countOperations(self, num1: int, num2: int) -> int:
        #recursive approach

        # def count_operations(num1,num2,count):
        #     if num1==0 or num2==0:
        #         return count
        #     if num1>=num2:
        #         return count_operations(num1-num2,num2,count+1)
        #     else:
        #         return count_operations(num1,num2-num1,count+1)
        # return count_operations(num1,num2,0)

        # tc=sc=0(max(num1,num2))

        # num1 = 2, num2 = 3
        # count_operations(2,3-2,1) count_operations(2,1,1)
        # count_operations(1,1,2)
        # count_operations(0,1,3)
        # num1 = 10, num2 = 10
        # count_operations(10,10,0)
        # count_operations(0,10,1)

        # iterative approach
        count=0
        while num1>0 and num2>0:
            if num1>=num2:
                num1=num1-num2
            else:
                num2=num2-num1
            count+=1
        return count
        #tc:0(max(num1,num2))
        #sc:0(1)


        