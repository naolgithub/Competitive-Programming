import heapq
class Solution:
    def resultsArray(self, queries: List[List[int]], k: int) -> List[int]:
        def distance(x,y):
            return abs(x)+abs(y)
        max_heap=[]
        result=[]
        for i in range(len(queries)):
            heapq.heappush(max_heap,-distance(queries[i][0],queries[i][1]))
            if len(max_heap)>k:
                heapq.heappop(max_heap)
            if len(max_heap)<k:
                result.append(-1)
            else:
                result.append(-max_heap[0])
        return result
        