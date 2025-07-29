from collections import deque
from typing import Optional

# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isEvenOddTree(self, root: Optional[TreeNode]) -> bool:
        def is_strictly_decreasing(arr):
            for i in range(1, len(arr)):
                if arr[i] >= arr[i - 1]:
                    return False
            return True

        def is_strictly_increasing(arr):
            for i in range(1, len(arr)):
                if arr[i] <= arr[i - 1]:
                    return False
            return True            

        level = 0
        queue = deque([root])

        while queue:
            level_list = []
            for _ in range(len(queue)):
                node = queue.popleft()

                # Parity check
                if level % 2 == 0:
                    if node.val % 2 == 0:  # even value on even-indexed level (invalid)
                        return False
                else:
                    if node.val % 2 == 1:  # odd value on odd-indexed level (invalid)
                        return False

                level_list.append(node.val)

                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)

            # Order check
            if level % 2 == 0:
                if not is_strictly_increasing(level_list):
                    return False
            else:
                if not is_strictly_decreasing(level_list):
                    return False

            level += 1

        return True
