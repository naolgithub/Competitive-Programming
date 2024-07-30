class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        graph = [[] for _ in range(numCourses)]
        incoming = [0 for _ in range(numCourses)]
        queue = deque()
        order = []
        
        # Build the graph and count the incoming edges for each node
        for course, pre in prerequisites:
            graph[pre].append(course)
            incoming[course] += 1
        
        # Enqueue all nodes with no incoming edges
        for course in range(numCourses):
            if incoming[course] == 0:
                queue.append(course)
        
        # Process the graph
        while queue:
            course = queue.popleft()
            order.append(course)
            for neighbor in graph[course]:
                # Current node is removed, so neighbor
                # has one less incoming edge
                incoming[neighbor] -= 1
                # If neighbor has no remaining incoming edges, it can now be processed
                if incoming[neighbor] == 0:
                    queue.append(neighbor)
        
        # If there are not exactly numCourses in the order, it means there was a cycle
        if len(order) != numCourses:
            return []
        
        return order
