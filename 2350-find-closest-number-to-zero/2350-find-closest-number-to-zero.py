class Solution:
    def findClosestNumber(self, nums: List[int]) -> int:
        # closest = nums[0]
        # for num in nums[1:]:
        #     if abs(num) < abs(closest):
        #         closest = num
        #     elif abs(num) == abs(closest) and num > closest:
        #         closest = num
        # return closest
        # tc: N sc:1
        min_heap = []
        for num in nums:
            heapq.heappush(min_heap, (abs(num), -num))
        return -min_heap[0][1]
        #tc: NlogN sc:N
        