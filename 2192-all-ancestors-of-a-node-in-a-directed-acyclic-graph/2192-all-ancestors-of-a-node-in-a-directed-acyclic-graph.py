class Solution:
    def getAncestors(self, n: int, edges: List[List[int]]) -> List[List[int]]:
        graph = defaultdict(list)
        indegree = [0] * n
        for u, v in edges:
            graph[u].append(v)
            indegree[v] += 1
        
        topologicalOrdering = []
        queue = deque([node for node in range(n) if indegree[node] == 0])
        
        while queue:
            node = queue.popleft()
            topologicalOrdering.append(node)
            for neighbor in graph[node]:
                indegree[neighbor] -= 1
                if indegree[neighbor] == 0:
                    queue.append(neighbor)
        
        ancestors = [set() for naol in range(n)]
        
        for node in topologicalOrdering:
            for neighbor in graph[node]:
                # Update the ancestors of the neighbor
                ancestors[neighbor].update(ancestors[node])
                ancestors[neighbor].add(node)
        
        result = [sorted(list(ancestors[node])) for node in range(n)]
        
        return result
