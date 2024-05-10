class Solution:
    def findMin(self, nums: List[int]) -> int:
        left=0
        right=len(nums)-1
        holder=nums[0]
        while left<=right:
            if nums[left]<nums[right]:
                holder=min(holder,nums[left])
            middle=left+(right-left)//2
            holder=min(holder,nums[middle])
            if nums[middle]>=nums[left]:
                left=middle+1
            else:
                right=middle-1
        return holder
     
       # nums = [3,4,5,1,2]
       # variable=someValue
       # variable=min(variable,middle)
       # if nums[middle]>=nums[left]:
          # search right
       # else:
          # search left
        
        
        #[1,2,3,4,5]