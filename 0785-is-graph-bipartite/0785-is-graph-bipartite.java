class Solution {
    private boolean dfs(int[][] graph, int[] colors, int node, int color) {
        colors[node] = color;

        for (int neighbor : graph[node]) {
            if (colors[neighbor] == 0) {
                // If the neighbor is uncolored, color it with the opposite color
                if (!dfs(graph, colors, neighbor, -color)) {
                    return false;
                }
            } else if (colors[neighbor] == color) {
                // If the neighbor is colored with the same color, the graph is not bipartite
                return false;
            }
        }

        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n]; // 0: uncolored, 1: color1, -1: color2

        for (int i = 0; i < n; i++) {
            if (colors[i] == 0) {
                // If the node is uncolored, start DFS from this node with color 1
                if (!dfs(graph, colors, i, 1)) {
                    return false;
                }
            }
        }

        return true;
    }
}