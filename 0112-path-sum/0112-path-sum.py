# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        self.foundPathSum = False
        def dfs(root, parentSum):
            # base case
            if not root:
                return
            if not root.left and not root.right:
                pathSum = root.val + parentSum
                if pathSum == targetSum:
                    self.foundPathSum = True
                return
                    
            # recurrence relation
            dfs(root.left, parentSum + root.val)
            dfs(root.right, parentSum + root.val)
        dfs(root, 0)
        return self.foundPathSum