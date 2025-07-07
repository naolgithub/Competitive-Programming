class Solution:
    def minStoneSum(self, piles: List[int], k: int) -> int:
        max_heap=[]
        for i in range(len(piles)):
            heapq.heappush(max_heap,-piles[i])
        for i in range(k):
            heaviest_stone=-heapq.heappop(max_heap) # making stone positive
            reduce_stone=ceil(heaviest_stone/2) # calculating ceil
            heapq.heappush(max_heap,-reduce_stone)
        return -sum(max_heap)
        #tc: O(N+kLogN)
        #sc: O(N)
        
        