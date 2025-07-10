import heapq
class Solution:
    def maximumProduct(self, nums: List[int], k: int) -> int:
        min_heap=[]
        modulo=10**9+7
        for i in range(len(nums)):
            heapq.heappush(min_heap,nums[i])
        for i in range(k):
            smallest=heapq.heappop(min_heap)
            heapq.heappush(min_heap,smallest+1)
        max_product=1
        for i in range(len(min_heap)):
            max_product*=min_heap[i]
        return max_product%modulo
        