class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        result = []

        def generate(index:int, current:List[int]):
            if index == len(nums):
                result.append(current)
                return

            # Exclude nums[index]
            generate(index + 1, list(current))

            # Include nums[index]

            # with_current = list(current)
            # with_current.append(nums[index])
            #or
            with_current=current
            with_current.append(nums[index])
            
            generate(index + 1, with_current)

        generate(0, [])
        return result
