from collections import defaultdict, deque
from typing import List

class Solution:
    def numBusesToDestination(self, routes: List[List[int]], source: int, target: int) -> int:
        if source == target:
            return 0
        
        graph = defaultdict(set)
        
        # Build the graph: each bus stop points to the buses that visit that stop
        for bus, busStops in enumerate(routes):
            for eachBusStop in busStops:
                graph[eachBusStop].add(bus)
        
        queue = deque(graph[source])
        visited = set(graph[source])
        
        count = 0
        while queue:
            count += 1
            for _ in range(len(queue)):
                currentBus = queue.popleft()
                for busStop in routes[currentBus]:
                    if busStop == target:
                        return count
                    for nextBus in graph[busStop]:
                        if nextBus not in visited:
                            visited.add(nextBus)
                            queue.append(nextBus)
        
        return -1


