# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        #dfs
        # def dfs(leftNode,rightNode):
        #     if not leftNode and not rightNode:
        #         return True
        #     if not leftNode or not rightNode:
        #         return False
        #     return leftNode.val==rightNode.val and dfs(leftNode.left,rightNode.right) and dfs(leftNode.right, rightNode.left)
        # return dfs(root.left,root.right)

        #iterative approach (bfs)
        if not root:
            return True
        queue=deque([(root.left,root.right)])
        while queue:
            for _ in range(len(queue)):
                leftNode,rightNode=queue.popleft()
                if not leftNode and not rightNode:
                    continue
                if not leftNode or not rightNode:
                    return False
                if leftNode.val!=rightNode.val:
                    return False
                queue.append([leftNode.left,rightNode.right])
                queue.append([leftNode.right,rightNode.left])
        return True