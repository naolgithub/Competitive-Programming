# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        #bfs
        if not root:
            return []
        queue=deque([root])
        result=[]
        while queue:
            current_list=[]
            for _ in range(len(queue)):
                current_node=queue.popleft()
                current_list.append(current_node.val)
                if current_node.left:
                    queue.append(current_node.left)
                if current_node.right:
                    queue.append(current_node.right)
            result.append(current_list)
        return result
        