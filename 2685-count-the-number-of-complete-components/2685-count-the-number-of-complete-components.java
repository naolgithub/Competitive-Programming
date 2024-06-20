class Solution {
    private boolean isComplete(List<Integer> component, List<List<Integer>> graph) {
        int k = component.size();
        int expectedEdgeCount = k * (k - 1) / 2;
        int actualEdgeCount = 0;

        for (int node : component) {
            for (int neighbor : graph.get(node)) {
                if (component.contains(neighbor)) {
                    actualEdgeCount++;
                }
            }
        }

        // Since each edge is counted twice, divide by 2
        actualEdgeCount /= 2;

        return actualEdgeCount == expectedEdgeCount;
    }    
    private void dfs(int node, List<List<Integer>> graph, boolean[] visited, List<Integer> component) {
        visited[node] = true;
        component.add(node);
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited, component);
            }
        }
    }    
    public int countCompleteComponents(int n, int[][] edges) {
        // Step 1: Represent the graph using an adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        int completeComponentsCount = 0;

        // Step 2: Find all connected components using DFS
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                dfs(i, graph, visited, component);

                // Step 3: Check if the found component is complete
                if (isComplete(component, graph)) {
                    completeComponentsCount++;
                }
            }
        }

        return completeComponentsCount;
    }





}