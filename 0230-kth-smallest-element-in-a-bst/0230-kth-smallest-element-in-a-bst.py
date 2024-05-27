# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def dfs(self, root):
        if root:
            self.dfs(root.left)
            self.container.append(root.val)
            self.dfs(root.right)
    
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        self.container = []  
        self.dfs(root)  
        return self.container[k-1]  
        