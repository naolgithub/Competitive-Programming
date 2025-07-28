# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findTarget(self, root: Optional[TreeNode], k: int) -> bool:
        #inorder traversal+two pointer
        def inorder(node):
            return inorder(node.left)+[node.val]+inorder(node.right)if node else []
        sorted_values=inorder(root)
        left,right=0,len(sorted_values)-1
        while left<right:
            current_sum=sorted_values[left]+sorted_values[right]
            if current_sum==k:
                return True
            elif current_sum>k:
                right-=1
            else:
                left+=1
        return False


        