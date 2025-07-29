# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def deepestLeavesSum(self, root: Optional[TreeNode]) -> int:
        if not root:
            return None
        deepest_level_sum=0
        queue=deque([root])
        while queue:
            current_level_sum=0
            for _ in range(len(queue)):
                node=queue.popleft()
                current_level_sum+=node.val
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            deepest_level_sum=current_level_sum
        return deepest_level_sum

        