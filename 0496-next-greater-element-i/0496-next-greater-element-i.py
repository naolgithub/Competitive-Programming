class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        freq={}
        stack=[]
        for i in range(len(nums2)):
            while stack and nums2[i]>stack[-1]:
                freq[stack.pop()]=nums2[i]
            stack.append(nums2[i])
        for i in range(len(nums1)):
            nums1[i]=freq[nums1[i]] if nums1[i] in freq else -1
        return nums1