import heapq
class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        def distance(x,y):
            return sqrt(x*x+y*y)
        max_heap=[]
        for i in range(len(points)):
            heapq.heappush(max_heap,(-distance(points[i][0],points[i][1]),points[i][0],points[i][1]))
            if len(max_heap)>k:
                heapq.heappop(max_heap)
        return [[point1,point2] for disnce,point1,point2 in max_heap]
        