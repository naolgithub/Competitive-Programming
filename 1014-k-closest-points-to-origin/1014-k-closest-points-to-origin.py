class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        # def distance(x,y):
        #     return sqrt(x**2+y**2)
        # min_heap=[]
        # result=[]
        # for i in range(len(points)):
        #     heapq.heappush(min_heap,(distance(points[i][0],points[i][1]),points[i][0],points[i][1]))
        # for _ in range(k):
        #     distance,point1,point2=heapq.heappop(min_heap)
        #     result.append([point1,point2])
        # return result
        # #tc: NlogN+KlogN
        # #sc:N+K--->N

        def distance(x,y):
            return x*x+y*y
        max_heap=[]
        for i in range(len(points)):
            heapq.heappush(max_heap,(-distance(points[i][0],points[i][1]),points[i][0],points[i][1]))
            if len(max_heap)>k:
                heapq.heappop(max_heap)
        return [[point1,point2] for distance,point1,point2 in max_heap]
        #tc: NlogK
        #sc: K
    