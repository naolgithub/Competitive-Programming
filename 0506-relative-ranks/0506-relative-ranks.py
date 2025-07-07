import heapq
class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        max_heap=[]
        for index,val in enumerate(score):
            heapq.heappush(max_heap,(-val,index))
        result=['']*len(score)
        for rank in range(len(score)):
            val,index=heapq.heappop(max_heap)
            if rank==0:
                result[index]="Gold Medal"
            elif rank==1:
                result[index]="Silver Medal"
            elif rank==2:
                result[index]="Bronze Medal"
            else:
                result[index]=str(rank+1)
        return result