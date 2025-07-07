import heapq
class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        min_heap=[]
        min_operations=0

        for i in range(len(nums)):
            heapq.heappush(min_heap,nums[i])
        
        while min_heap[0]<k:
            smallest=heapq.heappop(min_heap)
            another_smallest=heapq.heappop(min_heap)
            new_insert=min(smallest,another_smallest)*2+max(smallest,another_smallest)
            heapq.heappush(min_heap,new_insert)
            min_operations+=1
        return min_operations