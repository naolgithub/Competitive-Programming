# """
# This is MountainArray's API interface.
# You should not implement it, or speculate about its implementation
# """
#class MountainArray:
#    def get(self, index: int) -> int:
#    def length(self) -> int:

class Solution:
    def findPeakOfMountain(self,mountainArr):
        left=0
        right=mountainArr.length()-1
        while left<right:
            middle=left+(right-left)//2
            if mountainArr.get(middle)>mountainArr.get(middle+1):
                right=middle
            else:
                left=middle+1
        return left
    def binarySearch(self,target,mountainArr,left,right):
        isAscending=mountainArr.get(left)<mountainArr.get(right)
        while left<=right:
            middle=left+(right-left)//2
            if mountainArr.get(middle)==target:
                return middle
            if isAscending:
                if mountainArr.get(middle)>target:
                    right=middle-1
                else:
                    left=middle+1
            else:
                if mountainArr.get(middle)<target:
                    right=middle-1
                else:
                    left=middle+1
        return -1
    def findInMountainArray(self, target: int, mountain_arr: 'MountainArray') -> int:
        #Finding peak mountian
        peakOfMountain=self.findPeakOfMountain(mountain_arr)
        #if our target is  on the left side of the peak
        leftSideTarget=self.binarySearch(target,mountain_arr,0,peakOfMountain)
        if leftSideTarget!=-1:
            return leftSideTarget
        #if our target is  on the right side of the peak
        else:
            return self.binarySearch(target,mountain_arr,peakOfMountain+1,mountain_arr.length()-1)
        