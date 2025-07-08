import heapq
import math
class Solution:
    def maxKelements(self, nums: List[int], k: int) -> int:
        max_heap=[] #sc: N
        for i in range(len(nums)): #tc:NlogN
            heapq.heappush(max_heap,-nums[i])
        maximal_score=0
        for i in range(k): #tc: KlogN
            largest_element=-heapq.heappop(max_heap)
            maximal_score+=largest_element
            heapq.heappush(max_heap,-math.ceil(largest_element/3))
        return maximal_score

        #tc: O(NlogN+KlogN)
        #sc: O(N)
        