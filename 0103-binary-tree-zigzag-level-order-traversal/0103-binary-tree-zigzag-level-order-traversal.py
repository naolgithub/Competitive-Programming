# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return []
        queue=deque([root])
        result=[]
        depth=0
        while queue:
            level_nodes=[]
            for _ in range(len(queue)):
                node=queue.popleft()
                level_nodes.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            if depth%2==1:
                result.append(level_nodes[::-1])
            else:
                result.append(level_nodes)
            depth+=1
        return result