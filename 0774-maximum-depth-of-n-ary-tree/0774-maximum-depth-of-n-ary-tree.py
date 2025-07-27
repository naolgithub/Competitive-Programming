"""
# Definition for a Node.
class Node:
    def __init__(self, val: Optional[int] = None, children: Optional[List['Node']] = None):
        self.val = val
        self.children = children
"""
from collections import deque
class Solution:
    def maxDepth(self, root: 'Node') -> int:
        if not root:
            return 0
        queue=deque([root])
        depth=0
        while queue:
            for _ in range(len(queue)):
                node=queue.popleft()
                if node.children:
                    queue.extend(node.children)
            depth+=1
        return depth
        