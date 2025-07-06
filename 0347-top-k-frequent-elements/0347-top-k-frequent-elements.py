from collections import Counter
import heapq
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # counter=Counter(nums)
        counter={}
        for i in range(len(nums)):
            if nums[i] not in counter:
                counter[nums[i]]=1
            else:
                counter[nums[i]]+=1
        min_heap=[]
        for key,value in counter.items():
            if len(min_heap)<k:
                heapq.heappush(min_heap,(value,key))
            else:
                heapq.heappushpop(min_heap,(value,key))
        return [h[1] for h in min_heap]
        #tc:N+Nlogk--->Nlogk assuming k<N
        #sc:k+N-->N
        