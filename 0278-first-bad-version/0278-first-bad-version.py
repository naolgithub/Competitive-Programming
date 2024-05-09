# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        firstBadProduct=float('inf')
        left=1
        right=n
        while left<=right:
            middle=left+(right-left)//2
            if isBadVersion(middle):
                firstBadProduct=middle
                right=middle-1
            else:
                left=middle+1
        return firstBadProduct
        
        