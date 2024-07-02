class Solution:
    def maxDistance(self, grid: List[List[int]]) -> int:
        if len(grid)==0:
            return -1
        directions=[(1,0),(-1,0),(0,1),(0,-1)]
        queue=deque()
        
        #Multisource bfs question
        #Add all land cells to the queue and
        #mark them as visited
        for row in range(len(grid)):
            for col in range(len(grid[0])):
                if grid[row][col]==1:
                    queue.append((row,col))
        # if no land or no water cells, return -1
        if len(grid)==0 or len(queue)==len(grid)*len(grid):
            return -1
        maxWaterDistanceFromNearestLand=-1
        
        #Apply bfs from all land cells
        while queue:
            maxWaterDistanceFromNearestLand+=1
            for i in range(len(queue)):
                row,col=queue.popleft()
                for dr,dc in directions:
                    newRow,newCol=row+dr,col+dc
                    if 0<=newRow<len(grid) and 0<=newCol<len(grid) and grid[newRow][newCol]==0:
                        grid[newRow][newCol]=1
                        queue.append((newRow,newCol))
        return maxWaterDistanceFromNearestLand