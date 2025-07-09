import heapq
from collections import Counter
class Solution:
    def frequencySort(self, s: str) -> str:
        max_heap=[]
        counter=Counter(s)
        result=[]
        for key,val in counter.items():
            heapq.heappush(max_heap,(-val,key))
        for i in range(len(max_heap)):
            val,key=heapq.heappop(max_heap)
            for j in range(-val):
                result.append(key) 
        return ''.join(result)