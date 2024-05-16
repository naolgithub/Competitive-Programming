# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def insertIntoBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        if not root:
            return TreeNode(val)
        else:
            if root.val>val:
                # inserting into left side
                if root.left!=None:
                    self.insertIntoBST(root.left,val)
                else:
                    root.left=TreeNode(val)
            else:
                # inserting into right side
                if root.right!=None:
                    self.insertIntoBST(root.right,val)
                else:
                    root.right=TreeNode(val)
        return root
        