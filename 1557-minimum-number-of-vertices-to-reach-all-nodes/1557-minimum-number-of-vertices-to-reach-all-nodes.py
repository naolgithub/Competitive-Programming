class Solution:
    def findSmallestSetOfVertices(self, n: int, edges: List[List[int]]) -> List[int]:
        uniqueSolution=[]
        incomingDegree=[False]*n
        for edge in edges:
            incomingDegree[edge[1]]=True
        for index in range(n):
            if not incomingDegree[index]:
                uniqueSolution.append(index)
        return uniqueSolution
        
        