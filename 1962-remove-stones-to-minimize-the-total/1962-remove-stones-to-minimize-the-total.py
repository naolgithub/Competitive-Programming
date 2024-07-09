import heapq
class Solution:
    def minStoneSum(self, piles: List[int], k: int) -> int:
        piles=[-pile for pile in piles]
        #min heapify piles
        heapq.heapify(piles)
        while k:
            current=heapq.heappop(piles)
            current=current//2
            heapq.heappush(piles,current)
            k-=1
        return -sum(piles)