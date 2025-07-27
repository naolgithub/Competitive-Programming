# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        #dfs
        # if not root:
        #     return 0
        # left=self.maxDepth(root.left)
        # right=self.maxDepth(root.right)
        # return 1+max(right,left)

        #bfs
        if not root:
            return 0
        queue=deque([root])
        depth=0
        while queue:
            for _ in range(len(queue)):
                current_node=queue.popleft()
                if current_node.left:
                    queue.append(current_node.left)
                if current_node.right:
                    queue.append(current_node.right)
            depth+=1
        return depth

        