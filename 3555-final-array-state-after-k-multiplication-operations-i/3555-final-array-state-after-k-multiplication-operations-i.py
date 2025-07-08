class Solution:
    def getFinalState(self, nums: List[int], k: int, multiplier: int) -> List[int]:
        min_heap=[]
        for key,val in enumerate(nums):
            heapq.heappush(min_heap,(val,key))
        
        for _ in range(k):
            while len(min_heap)>0:
                val,key=heapq.heappop(min_heap)
                if nums[key]==val:
                    break
            nums[key]*=multiplier
            heapq.heappush(min_heap,(nums[key],key))
        return nums