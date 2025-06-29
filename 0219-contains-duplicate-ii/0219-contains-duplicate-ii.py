class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        # for i in range(len(nums)-1):
        #     for j in range(i+1,len(nums)):
        #         if nums[i]==nums[j] and abs(i-j)<=k:
        #             return True
        # return False
        left=0
        set_container=set()
        for right in range(len(nums)):
            if nums[right] in set_container:
                return True
            set_container.add(nums[right])
            if right-left==k:
                set_container.remove(nums[left])
                left+=1
        return False