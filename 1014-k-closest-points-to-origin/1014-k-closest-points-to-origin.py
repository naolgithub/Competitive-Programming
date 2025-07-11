class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        def distance(x,y):
            return sqrt(x**2+y**2)
        min_heap=[]
        result=[]
        for i in range(len(points)):
            heapq.heappush(min_heap,(distance(points[i][0],points[i][1]),points[i][0],points[i][1]))
        for _ in range(k):
            distance,point1,point2=heapq.heappop(min_heap)
            result.append([point1,point2])
        return result
        