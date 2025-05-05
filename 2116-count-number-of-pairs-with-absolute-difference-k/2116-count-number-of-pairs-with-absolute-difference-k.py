class Solution:
    def countKDifference(self, nums: List[int], k: int) -> int:
        #Brute force
        # count=0
        # for i in range(len(nums)-1):
        #     for j in range(i+1,len(nums)):
        #         if abs(nums[i]-nums[j])==k:
        #             count+=1
        # return count

        #Optimized approach
        freq={}
        count=0
        for num in nums:
            freq[num]=freq.get(num,0)+1
        for num in freq:
            if num+k in freq:
                count+=freq[num]*freq[num+k]
        return count