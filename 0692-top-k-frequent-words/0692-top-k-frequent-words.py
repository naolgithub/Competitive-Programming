import heapq
from collections import Counter
class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:
        counter=Counter(words)
        max_heap=[]
        result=[]
        for key,val in counter.items():
            heapq.heappush(max_heap,(-val,key))
        for i in range(k):
            most_frequent,key=heapq.heappop(max_heap)
            result.append(key)
        return result
