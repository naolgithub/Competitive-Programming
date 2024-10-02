class Solution:
    def minScore(self, n: int, roads: List[List[int]]) -> int:
        adjacencyList=defaultdict(list) #node->list of (neighbor,distance)
        for source,destination,distance in roads:
            adjacencyList[source].append((destination,distance))
            adjacencyList[destination].append((source,distance))
        def dfs(node):
            if node in visitedCity:
                return
            visitedCity.add(node)
            nonlocal result
            for neighbor,distance in adjacencyList[node]:
                result=min(result,distance)
                dfs(neighbor)
        result=float("inf")
        visitedCity=set()
        dfs(1)
        return result
        