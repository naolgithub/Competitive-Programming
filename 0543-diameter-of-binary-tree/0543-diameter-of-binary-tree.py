# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    largest_diameter=0
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        def maxDepthOfCurrentNode(root):
            if not root:
                return 0
            left=maxDepthOfCurrentNode(root.left)
            right=maxDepthOfCurrentNode(root.right)
            current_diameter=left+right
            self.largest_diameter=max(self.largest_diameter,current_diameter)
            return 1+max(left,right)
        maxDepthOfCurrentNode(root)
        return self.largest_diameter

        