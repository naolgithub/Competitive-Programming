class Solution:
    def binarySearch(self,array,target,left,right)->int:
        if left>right:
            return -1
        middle=left+(right-left)//2
        if array[middle]==target:
            return middle
        elif array[middle]<target:
            return self.binarySearch(array,target,middle+1,right)
        else:
            return self.binarySearch(array,target,left,middle-1)
    def search(self, nums: List[int], target: int) -> int:
        left=0
        right=len(nums)-1
        return self.binarySearch(nums,target,left,right)