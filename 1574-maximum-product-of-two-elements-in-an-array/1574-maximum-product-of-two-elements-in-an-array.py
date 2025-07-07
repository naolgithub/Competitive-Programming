import heapq
class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        k=2
        min_heap=[]
        for i in range(len(nums)):
            if len(min_heap)<k:
                heapq.heappush(min_heap,nums[i])
            else:
                heapq.heappushpop(min_heap,nums[i])
        return (min_heap[0]-1)*(min_heap[1]-1)
        
        