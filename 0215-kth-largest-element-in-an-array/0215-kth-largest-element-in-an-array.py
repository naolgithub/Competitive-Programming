import heapq
class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        # tc: N(doing inserting and popping off for entire nums array)(logK(inseting elements)+logk(popping off elements)). so tc: Nlogk
        # sc: O(k) for building the heap of size k
        #Min Heap
        min_heap=[]
        for num in nums:
            if len(min_heap)<k:
                heapq.heappush(min_heap,num)
            else:
                heapq.heappushpop(min_heap,num)
        return min_heap[0]
        