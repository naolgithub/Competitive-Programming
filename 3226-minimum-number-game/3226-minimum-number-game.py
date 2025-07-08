import heapq

class Solution:
    def numberGame(self, nums: List[int]) -> List[int]:
        heapq.heapify(nums)  
        result = []

        while len(nums) > 1:
            first = heapq.heappop(nums)   # smallest
            second = heapq.heappop(nums)  # second smallest
            result.append(second)
            result.append(first)

        return result
