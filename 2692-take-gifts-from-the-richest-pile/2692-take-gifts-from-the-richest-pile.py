import heapq
import math
class Solution:
    def pickGifts(self, gifts: List[int], k: int) -> int:
        max_heap=[] #sc:N
        
        for i in range(len(gifts)):  # tc:N
            heapq.heappush(max_heap,-gifts[i]) 
        
        for i in range(k): # tc:KlogN
            maximum_gift=heapq.heappop(max_heap)
            reduced_gift=floor(sqrt(-maximum_gift))
            heapq.heappush(max_heap,-reduced_gift)

        return -sum(max_heap) # tc:N

        #TC: O(N+KlogN)
        #SC: O(N)
        
