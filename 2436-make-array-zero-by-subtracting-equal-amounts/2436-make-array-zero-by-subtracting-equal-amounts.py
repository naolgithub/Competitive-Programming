class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        set_container=set()
        for num in nums:
            if num!=0:
                set_container.add(num)
        return len(set_container)
        