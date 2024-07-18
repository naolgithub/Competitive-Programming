class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int totalSum = 0;
        Arrays.sort(costs, 
            (a, b) -> (a[0] - a[1]) - (b[0] - b[1])
        );

        for (int i = 0; i < costs.length; i++) {
            if (i < costs.length / 2) {
                totalSum += costs[i][0];
            } else {
                totalSum += costs[i][1];
            }
        }
        return totalSum;
    }
}