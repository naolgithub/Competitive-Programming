import heapq
class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        #Build max heap
        for i in range(len(stones)):
            stones[i]=-stones[i]
        #Build heap
        heapq.heapify(stones)
        #Smashing stones
        while len(stones)>1:
            heaviest=heapq.heappop(stones)
            second_heaviest=heapq.heappop(stones)
            if heaviest!=second_heaviest:
                heapq.heappush(stones,heaviest-second_heaviest)
        if len(stones)>0:
            return -heapq.heappop(stones)
        else:
            return 0
        
        #tc:NlogN
        #sc:1

        # 1,1,2,4,7,8
        # 1,1,1,2,4
        # 1,1,1,2
        # 1,1,1
        # 1