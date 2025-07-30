# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def maxLevelSum(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        queue=deque([root])
        global_max_level=float('-inf')
        level=0
        depth=1
        while queue:
            current_level_sum=0
            for _ in range(len(queue)):
                node=queue.popleft()
                current_level_sum+=node.val
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            if current_level_sum>global_max_level:
                global_max_level=current_level_sum
                level=depth
            depth+=1
        return level

        