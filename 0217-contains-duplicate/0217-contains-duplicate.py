class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # set_container=set()
        # for i in range(len(nums)):
        #     if nums[i] in set_container:
        #         return True
        #     else:
        #         set_container.add(nums[i])
        # return False

        # or
        
        return len(nums)!=len(set(nums))
        