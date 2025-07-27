# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
        if not root:
            return []
        queue=deque([root])
        result=[]
        depth=0
        while queue:
            sum_of_current_level=0
            num_of_current_level=0
            for _ in range(len(queue)):
                node=queue.popleft()
                sum_of_current_level+=node.val
                num_of_current_level+=1
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            result.append(sum_of_current_level/num_of_current_level)
        return result
                
        