class Solution {
    private boolean dfs(int node, int destination, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        if (node == destination) {
            return true;
        }
        
        visited.add(node);
        
        for (int neighbour : graph.get(node)) {
            if (!visited.contains(neighbour)) {
                if (dfs(neighbour, destination, graph, visited)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap();
        
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }
        
        Set<Integer> visited = new HashSet();
        return dfs(source, destination, graph, visited);
    }
}
