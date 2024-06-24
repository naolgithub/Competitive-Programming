from collections import defaultdict
from collections import deque

class Solution:
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        graph = defaultdict(list)
        for a, b in edges:
            graph[a].append(b)
            graph[b].append(a)
        
        visited = set()
        queue = deque([source])
        
        while queue:
            currentNode = queue.popleft()   #edges = [[0,1],[1,2],[2,0]],source=0, destination=2
            if currentNode == destination:
                return True
            for nextNode in graph[currentNode]:
                if nextNode not in visited:
                    visited.add(nextNode)
                    queue.append(nextNode)
        
        return False
