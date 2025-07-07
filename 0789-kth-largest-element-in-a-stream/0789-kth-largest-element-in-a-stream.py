import heapq
class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        
        #Initialize k
        self.k=k

        #Initialize min heap
        self.min_heap=nums 

        #Build min heap(heapifying) 
        heapq.heapify(self.min_heap) 

        for _ in range(len(self.min_heap)):   
            if len(self.min_heap)>self.k:
                heapq.heappop(self.min_heap)
        
    def add(self, val: int) -> int:
        heapq.heappush(self.min_heap,val) 
        if len(self.min_heap)>self.k:
            heapq.heappop(self.min_heap) 
        return self.min_heap[0]

        # tc: N+NlogK -->NlogK
        # sc: N+K ---> N


# Your KthLargest object will be instantiated and called as such:
# obj = KthLargest(k, nums)
# param_1 = obj.add(val)