# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        def path_sum(root,current_sum):
            if not root:
                return False
            current_sum+=root.val
            if not root.left and not root.right:
                return current_sum==targetSum
            return path_sum(root.left,current_sum) or path_sum(root.right,current_sum)
        return path_sum(root,0)
        