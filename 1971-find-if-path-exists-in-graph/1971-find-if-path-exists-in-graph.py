from collections import defaultdict
from typing import List

class Solution:
    def dfs(self, node, destination, graph, visited):
        if node == destination:
            return True
        
        visited.add(node)
        
        for neighbour in graph[node]:
            if neighbour not in visited:
                if self.dfs(neighbour, destination, graph, visited):
                    return True
                    
        return False
    
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        graph = defaultdict(list)
        
        for node1, node2 in edges:
            graph[node1].append(node2)
            graph[node2].append(node1)
        
        visited = set()
        return self.dfs(source, destination, graph, visited)
