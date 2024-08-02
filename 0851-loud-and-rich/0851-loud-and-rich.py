class Solution:
    def loudAndRich(self, richer: List[List[int]], quiet: List[int]) -> List[int]:
        n=len(quiet)
        def dfs(graph,source,quietness,output):
            leastQuiet=source
            for neighbor in graph[source]:
                if output[neighbor] is None:
                    dfs(graph,neighbor,quietness,output)
                leastQuiet=min(leastQuiet,output[neighbor],key=lambda x:quietness[x])
            output[source]=leastQuiet
        graph=[set() for i in range(n)]
        for relation in richer:
            graph[relation[1]].add(relation[0])
        output=[None for i in range(n)]
        for person in range(n):
            if output[person] is None:
                dfs(graph,person,quiet,output)
        return output
        