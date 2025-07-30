# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthLargestLevelSum(self, root: Optional[TreeNode], k: int) -> int:
        queue=deque([root])
        depth=0
        kth_sum=-1
        level_sums=[]
        while queue:
            current_level_sum=0
            for _ in range(len(queue)):
                node = queue.popleft()
                current_level_sum+=node.val
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            level_sums.append(current_level_sum)
            depth+=1
        level_sums.sort(reverse=True)
        if depth<k:
            return -1
        return level_sums[k-1]
                
        