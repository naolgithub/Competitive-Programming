class Solution:
    def dfs(self, row: int, col: int) -> int:
        if row >= len(self.grid) or col >= len(self.grid[0]) or row < 0 or col < 0 or self.grid[row][col] == 0:
            return 1
        if (row, col) in self.visited:
            return 0
        self.visited.add((row, col))
        
        perimeter = self.dfs(row, col + 1)  # move right
        perimeter += self.dfs(row + 1, col)  # move down
        perimeter += self.dfs(row, col - 1)  # move left
        perimeter += self.dfs(row - 1, col)  # move up
        
        return perimeter
    
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        self.visited = set()
        self.grid = grid
        
        for row in range(len(grid)):
            for col in range(len(grid[0])):
                if grid[row][col] == 1:
                    return self.dfs(row, col)
        return 0
    
