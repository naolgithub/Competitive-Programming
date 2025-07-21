class Solution:
    def search(self, nums: List[int], target: int) -> int:
        # #binary search
        # left,right=0,len(nums)-1
        # while left<=right:
        #     mid=(left+right)//2
        #     if nums[mid]==target:
        #         return mid
        #     elif nums[mid]<target:
        #         left=mid+1
        #     else:
        #         right=mid-1
        # return -1
        # binary search with recursion(divide and conquer)
        def recursive_binary_search(nums,target,left,right):
            if left>right:
                return -1
            mid=(left+right)//2 #integer division which does not return float
            if nums[mid]==target:
                return mid
            if nums[mid]<target:
                return recursive_binary_search(nums,target,mid+1,right)
            else:
                return recursive_binary_search(nums,target,left,mid-1)
        return recursive_binary_search(nums,target,0,len(nums)-1)