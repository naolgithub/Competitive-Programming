class Solution:
    def highestPeak(self, isWater: List[List[int]]) -> List[List[int]]:
        waterLength, landLength = len(isWater), len(isWater[0])
        myFavouriteNumber=-1
        height = [[myFavouriteNumber] * landLength for naol in range(waterLength)]
        queue = deque()

        # Initialize the queue with all water cells
        for i in range(waterLength):
            for j in range(landLength):
                if isWater[i][j] == 1:
                    height[i][j] = 0
                    queue.append((i, j))

        # Directions for north, east, south, and west
        directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]

        # BFS to assign heights
        while queue:
            row, col = queue.popleft()
            for newRow, newCol in directions:
                newRow, newCol = row + newRow, col + newCol
                if 0 <= newRow < waterLength and 0 <= newCol < landLength and height[newRow][newCol] == myFavouriteNumber:
                    height[newRow][newCol] = height[row][col] + 1
                    queue.append((newRow, newCol))

        return height

        