class Solution:
    def updateMatrix(self, mat: List[List[int]]) -> List[List[int]]:
        if not mat or not mat[0]:
            return mat

        m, n = len(mat), len(mat[0])
        distances = [[float('inf')] * n for _ in range(m)]
        queue = deque()

        # Initialize the queue with all 0s in the matrix
        for row in range(m):
            for col in range(n):
                if mat[row][col] == 0:
                    distances[row][col] = 0
                    queue.append((row, col))

        # Directions for moving in the matrix (right, left, down, up)
        directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]

        # BFS
        while queue:
            row, col = queue.popleft()

            for dr, dc in directions:
                newRow, newCol = row + dr, col + dc

                if 0 <= newRow < m and 0 <= newCol < n:
                    if distances[newRow][newCol] > distances[row][col] + 1:
                        distances[newRow][newCol] = distances[row][col] + 1
                        queue.append((newRow, newCol))

        return distances

