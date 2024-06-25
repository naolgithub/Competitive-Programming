# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isUnivalTree(self, root: Optional[TreeNode]) -> bool:
        certainValue=root.val
        queue=deque()
        queue.append(root)
        
        while queue:
            queueLength=len(queue)
            for i in range(queueLength):
                node=queue.popleft()
                if node:
                    if node.val!=certainValue:
                        return False
                    queue.append(node.left)
                    queue.append(node.right)
        return True
        