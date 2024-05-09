class Solution:
    def upper(self,nums,target)->int:
        left=0
        right=len(nums)-1
        while left<=right:
            middle=left+(right-left)//2
            if nums[middle]<=target:
                left=middle+1
            else:
                right=middle-1
        if right==-1 or nums[right]!=target:
            return -1
        return right    
    def lower(self,nums,target)->int:
        left=0
        right=len(nums)-1
        while left<=right:
            middle=left+(right-left)//2
            if nums[middle]>=target:
                right=middle-1
            else:
                left=middle+1
        if left==len(nums) or nums[left]!=target:
            return -1
        return left
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        return [self.lower(nums,target),self.upper(nums,target)]
        