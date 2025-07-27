# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        #bfs
        # if not root:
        #     return 0
        # queue=deque([root])
        # depth=0
        # while queue:
        #     for _ in range(len(queue)):
        #         current_node=queue.popleft()
        #         if not current_node.left and not current_node.right:
        #             return depth+1
        #         if current_node.left:
        #             queue.append(current_node.left)
        #         if current_node.right:
        #             queue.append(current_node.right)
        #     depth+=1
        # return depth

        #dfs
        if not root:
            return 0
        
        # If one of the subtrees is missing, we must take the depth of the other
        if not root.left:
            return 1 + self.minDepth(root.right)
        if not root.right:
            return 1 + self.minDepth(root.left)
        
        # If both subtrees exist, take the minimum of the two
        return 1 + min(self.minDepth(root.left), self.minDepth(root.right))        
        