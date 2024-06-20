class Solution:
    def dfs(self, graph, colors, node, color):
        colors[node] = color
        for neighbor in graph[node]:
            if colors[neighbor] == 0:
                if not self.dfs(graph, colors, neighbor, -color):
                    return False
            elif colors[neighbor] == color:
                return False
        return True    
    def isBipartite(self, graph: List[List[int]]) -> bool:
        colors = [0] * len(graph)
        for i in range(len(graph)):
            if colors[i] == 0:
                if not self.dfs(graph, colors, i, 1):
                    return False
        return True        
        