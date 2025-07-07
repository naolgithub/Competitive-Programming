import heapq
class Solution:
    def halveArray(self, nums: List[int]) -> int:
        max_heap=[]
        min_operation=0
        total_sum=sum(nums)
        half_sum = total_sum / 2

        for i in range(len(nums)):
            heapq.heappush(max_heap,-nums[i])
        
        while total_sum>half_sum:
            largest_sum=-heapq.heappop(max_heap)
            reduced_num=largest_sum/2

            total_sum -=reduced_num
            
            heapq.heappush(max_heap,-reduced_num)
            min_operation+=1

        return min_operation
        # [3,8,20]
        # [3,8,10] 1
        # [3,8,5] 2
        # [3,4,5] 3
        # 16.5 -->original

        # 23.5 --->1 [5,9.5,8,1]
        # 18.75 --->2 [5,4.75,8,1]
        # 14.75 --> [5,4.75,4,1]

