class Solution:
    def binarySearch(self,nums,target,isFirstPosition)->int:
        left=0
        right=len(nums)-1
        positionOfTarget=-1
        while left<=right:
            middle=left+(right-left)//2
            if target>nums[middle]:
                left=middle+1
            elif target<nums[middle]:
                right=middle-1
            else:
                positionOfTarget=middle
                if isFirstPosition:
                    right=middle-1
                else:
                    left=middle+1
        return positionOfTarget
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        firstAndLastPostion=[-1,-1]
        firstPositionOfTarget=self.binarySearch(nums,target,True);
        lastPositionOfTarget=self.binarySearch(nums,target,False)
        firstAndLastPostion[0]=firstPositionOfTarget
        firstAndLastPostion[1]=lastPositionOfTarget
        return firstAndLastPostion
        