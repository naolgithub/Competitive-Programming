# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def isCousins(self, root: Optional[TreeNode], x: int, y: int) -> bool:
        if not root:
            return False
        queue=deque([root])
        while queue:
            seen=set()
            for _ in range(len(queue)):
                node=queue.popleft()
                seen.add(node.val)
                # same parent → not cousins  
                if node.left and node.right:
                    if (node.left.val == x and node.right.val == y) or \
                       (node.left.val == y and node.right.val == x):
                        return False                
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            if x in seen and y in seen:
                return True
        return False
        