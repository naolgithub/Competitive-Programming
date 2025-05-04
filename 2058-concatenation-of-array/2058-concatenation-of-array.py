class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        #Approach one
        # return nums+nums

        # Approach two
        result=[]
        for num in nums:
            result.append(num)
        for num in nums:
            result.append(num)
        return result
        