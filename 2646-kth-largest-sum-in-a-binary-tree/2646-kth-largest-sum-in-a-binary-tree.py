# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
import heapq
class Solution:
    def kthLargestLevelSum(self, root: Optional[TreeNode], k: int) -> int:
        #bfs+sorting approach
        # queue=deque([root])
        # depth=0
        # level_sums=[]
        # while queue:
        #     current_level_sum=0
        #     for _ in range(len(queue)):
        #         node = queue.popleft()
        #         current_level_sum+=node.val
        #         if node.left:
        #             queue.append(node.left)
        #         if node.right:
        #             queue.append(node.right)
        #     level_sums.append(current_level_sum)
        #     depth+=1
        # level_sums.sort(reverse=True)
        # if depth<k:
        #     return -1
        # return level_sums[k-1]

        #bfs+min_heap
        queue=deque([root])
        min_heap=[]
        depth=0
        while queue:
            current_level_sum=0
            for _ in range(len(queue)):
                node=queue.popleft()
                current_level_sum+=node.val
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            depth+=1
            heapq.heappush(min_heap,current_level_sum)
            while len(min_heap)>k:
                heapq.heappop(min_heap)
        if depth<k:
            return -1
        return min_heap[0] 
                
        