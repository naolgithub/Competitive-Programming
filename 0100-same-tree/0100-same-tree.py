# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        #dfs
        # if not p and not q:
        #     return True
        # if not p or not q:
        #     return False
        # return p.val==q.val and self.isSameTree(p.left,q.left) and self.isSameTree(p.right,q.right)

        #bfs
        queue=deque([(p,q)])
        while queue:
            for _ in range(len(queue)):
                nodep, nodeq = queue.popleft()
                if not nodep and not nodeq:
                    continue
                if not nodep or not nodeq:
                    return False
                if nodep.val!=nodeq.val:
                    return False
                queue.append((nodep.left,nodeq.left))
                queue.append((nodep.right,nodeq.right))
        return True