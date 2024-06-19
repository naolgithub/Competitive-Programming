class Solution {
    // DFS to count the number of bombs that can be detonated starting from bomb `i`
    private int dfs(List<List<Integer>> graph, boolean[] visited, int i) {
        visited[i] = true;
        int count = 1;
        for (int neighbor : graph.get(i)) {
            if (!visited[neighbor]) {
                count += dfs(graph, visited, neighbor);
            }
        }
        return count;
    }

    // Check if bomb `b2` is in range of bomb `b1`
    private static boolean inRange(int[] b1, int[] b2) {
        long dx = b1[0] - b2[0];
        long dy = b1[1] - b2[1];
        long distanceSquared = dx * dx + dy * dy;
        long rangeSquared = (long) b1[2] * b1[2];
        return distanceSquared <= rangeSquared;
    }    
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        List<List<Integer>> graph = new ArrayList<>();

        // Create adjacency list
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && inRange(bombs[i], bombs[j])) {
                    graph.get(i).add(j);
                }
            }
        }

        int maxDetonations = 0;

        // Use DFS to find the maximum number of bombs that can be detonated
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            maxDetonations = Math.max(maxDetonations, dfs(graph, visited, i));
        }

        return maxDetonations;
    }
}