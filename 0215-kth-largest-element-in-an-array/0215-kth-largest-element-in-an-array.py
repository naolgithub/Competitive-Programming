import heapq
class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        #Max heap of size N
        #Time: O(N+KlogN)
        #Space: O(1)
        
        for i in range(len(nums)):
            nums[i]=-nums[i]

        heapq.heapify(nums)

        for _ in range(k-1):
            heapq.heappop(nums)

        return -heapq.heappop(nums)
        