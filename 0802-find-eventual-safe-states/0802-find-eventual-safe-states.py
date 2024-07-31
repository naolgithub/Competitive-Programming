class Solution:
    def eventualSafeNodes(self, graph: List[List[int]]) -> List[int]:
        n=len(graph)
        safeMap={}
        def dfs(i):
            if i in safeMap:
                return safeMap[i]
            safeMap[i]=False
            for neighbor in graph[i]:
                if not dfs(neighbor):
                    # return safeMap[i] or
                    return False
            safeMap[i]=True
            # return True or 
            return safeMap[i]
        result=[]
        for i in range(n):
            if dfs(i):
                result.append(i)
        return result
        