class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        negatedStones=[-stone for stone in stones]
        heapq.heapify(negatedStones)
        while len(negatedStones)>1:
            heaviestStone=-heapq.heappop(negatedStones)
            secondHeaviestStone=-heapq.heappop(negatedStones)
            
            if heaviestStone!=secondHeaviestStone:
                heapq.heappush(negatedStones, -(heaviestStone-secondHeaviestStone))
        return -negatedStones[0] if negatedStones else 0