import heapq
class Solution:
    def kthLargestNumber(self, nums: List[str], k: int) -> str:
        max_heap=[]
        for i in range(len(nums)):
            heapq.heappush(max_heap,-int(nums[i]))
        for i in range(k-1):
            heapq.heappop(max_heap)
        return str(-heapq.heappop(max_heap))
        