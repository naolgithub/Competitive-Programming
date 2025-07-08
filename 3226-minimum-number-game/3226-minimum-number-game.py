import heapq

class Solution:
    def numberGame(self, nums: List[int]) -> List[int]:
        heapq.heapify(nums)  #tc:N, sc:1
        result = [] #sc:N tc:1

        while len(nums) > 1: #tc:NlogN sc:1
            first = heapq.heappop(nums)   # smallest
            second = heapq.heappop(nums)  # second smallest
            result.append(second)
            result.append(first)

        return result

        #tc:NlogN
        #sc:N
