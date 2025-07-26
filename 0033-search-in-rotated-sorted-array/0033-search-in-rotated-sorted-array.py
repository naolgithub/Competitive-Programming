class Solution:
    def search(self, nums: List[int], target: int) -> int:
        # recursion approach
        # def rotated_search(nums,target,start,end):
        #     if start>end:
        #         return -1
        #     mid=(start+end)//2
        #     if target==nums[mid]:
        #         return mid
        #     if nums[start]<=nums[mid]:
        #         if target>=nums[start] and target<=nums[mid]:
        #             return rotated_search(nums,target,start,mid-1)
        #         else:
        #             return rotated_search(nums,target,mid+1,end)
        #     if target>=nums[mid] and target<=nums[end]:
        #         return rotated_search(nums,target,mid+1,end)
        #     else:
        #         return rotated_search(nums,target,start,mid-1)
        # return rotated_search(nums,target,0,len(nums)-1)

        #iterative approach
        start,end=0,len(nums)-1
        while start<=end:
            mid=(start+end)//2
            if target==nums[mid]:
                return mid
            # Left half is sorted
            elif nums[start]<=nums[mid]:
                if target>=nums[start] and target<=nums[mid]:
                    end=mid-1
                else:
                    start=mid+1
            # Right half is sorted
            else:
                if target>=nums[mid] and target<=nums[end]:
                    start=mid+1
                else:
                    end=mid-1
        return -1

        