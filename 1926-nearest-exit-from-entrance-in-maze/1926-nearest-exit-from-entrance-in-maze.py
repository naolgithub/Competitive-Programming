class Solution:
    def nearestExit(self, maze: List[List[str]], entrance: List[int]) -> int:
        rows, cols = len(maze), len(maze[0])
        directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]

        queue = deque()  
        queue.append((entrance[0], entrance[1], 0)) # (row, col, steps)
        visitedCell = set()
        visitedCell.add((entrance[0], entrance[1]))

        while queue:
            row, col, numberOfSteps = queue.popleft()

            for dr, dc in directions:
                newRow, newCol = row + dr, col + dc

                if 0 <= newRow < rows and 0 <= newCol < cols and (newRow, newCol) not in visitedCell:
                    if maze[newRow][newCol] == '.':
                        # Check if it's an exit (on the border and not the entrance)
                        if (newRow == 0 or newRow == rows - 1 or newCol == 0 or newCol == cols - 1) and [newRow, newCol] != entrance:
                            return numberOfSteps + 1
                        # Otherwise, add to the queue for further exploration
                        queue.append((newRow, newCol, numberOfSteps + 1))
                        visitedCell.add((newRow, newCol))

        return -1    