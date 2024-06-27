class Solution:
    def reachableNodes(self, n: int, edges: List[List[int]], restricted: List[int]) -> int:
        # Create the graph
        graph = defaultdict(list)
        for a, b in edges:
            graph[a].append(b)
            graph[b].append(a)

        # Set of restricted nodes for O(1) lookup
        restrictedSet = set(restricted)

        # BFS initialization
        queue = deque()
        queue.append(0)
        visited = set()
        visited.add(0)
        countNumberOfNode = 0

        # BFS loop
        while queue:
            node = queue.popleft()
            countNumberOfNode += 1
            for neighborNode in graph[node]:
                if neighborNode not in visited and neighborNode not in restrictedSet:
                    visited.add(neighborNode)
                    queue.append(neighborNode)

        return countNumberOfNode        
