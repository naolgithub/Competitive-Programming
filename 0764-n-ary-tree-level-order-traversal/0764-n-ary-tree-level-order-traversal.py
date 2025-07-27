"""
# Definition for a Node.
class Node:
    def __init__(self, val: Optional[int] = None, children: Optional[List['Node']] = None):
        self.val = val
        self.children = children
"""
from collections import deque
class Solution:
    def levelOrder(self, root: 'Node') -> List[List[int]]:
        if not root:
            return []
        queue=deque([root])
        result=[]
        while queue:
            current_level=[]
            for _ in range(len(queue)):
                node=queue.popleft()
                current_level.append(node.val)
                if node.children:
                    queue.extend(node.children)
            result.append(current_level)
        return result
        