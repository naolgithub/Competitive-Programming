from collections import deque

class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        queue = deque()
        timePassed, freshOrange = 0, 0
        Rows, Cols = len(grid), len(grid[0])
        
        # Initialize the queue with all the rotten oranges
        for r in range(Rows):
            for c in range(Cols):
                if grid[r][c] == 1:
                    freshOrange += 1
                if grid[r][c] == 2:
                    queue.append((r, c))
        
        directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]
        
        # BFS process starts from initially rotten oranges
        while queue and freshOrange > 0:
            for _ in range(len(queue)):
                r, c = queue.popleft()
                
                for dr, dc in directions:
                    row, col = r + dr, c + dc
                    
                    # if inbounds and fresh orange, make it rotten
                    if row < 0 or row >= Rows or col < 0 or col >= Cols or grid[row][col] != 1:
                        continue
                    
                    grid[row][col] = 2
                    queue.append((row, col))
                    freshOrange -= 1
            
            timePassed += 1
        
        return timePassed if freshOrange == 0 else -1
