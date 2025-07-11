import heapq
class Solution:
    def findClosestElements(self, arr: List[int], k: int, x: int) -> List[int]:
        max_heap=[]
        result=[]
        for i in range(len(arr)):
            distance=abs(arr[i]-x)
            heapq.heappush(max_heap,(-distance,-arr[i]))
            if len(max_heap)>k:
                heapq.heappop(max_heap)
        result=[-num for distance, num in max_heap]
        return sorted(result)
        
        