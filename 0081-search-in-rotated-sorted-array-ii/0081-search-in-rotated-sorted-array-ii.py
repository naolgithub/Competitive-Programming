class Solution:
    def search(self, nums: List[int], target: int) -> bool:
        def rotated_search(nums, target, start, end):
            if start > end:
                return False

            mid = (start + end) // 2
            if nums[mid] == target:
                return True

            # Skip duplicates from start
            if nums[start] == nums[mid] == nums[end]:
                return (rotated_search(nums, target, start + 1, end - 1))

            # Left half is sorted
            if nums[start] <= nums[mid]:
                if nums[start] <= target <= nums[mid]:
                    return rotated_search(nums, target, start, mid - 1)
                else:
                    return rotated_search(nums, target, mid + 1, end)

            # Right half is sorted
            else:
                if nums[mid] <= target <= nums[end]:
                    return rotated_search(nums, target, mid + 1, end)
                else:
                    return rotated_search(nums, target, start, mid - 1)

        return rotated_search(nums, target, 0, len(nums) - 1)
