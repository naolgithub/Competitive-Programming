class Solution:
    def find132pattern(self, nums: List[int]) -> bool:
        stack=[]
        currentMin=nums[0]
        for num in nums[1:]:
            while stack and num>=stack[-1][0]:
                stack.pop()
            if stack and num>stack[-1][1]:
                return True
            
            stack.append([num,currentMin])
            currentMin=min(currentMin,num)
        return False
        