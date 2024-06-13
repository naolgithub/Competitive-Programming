class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] peopleTrustJudge = new int[n + 1];
        int[] trustCount = new int[n + 1];

        for (int[] t : trust) {
            peopleTrustJudge[t[0]]++;
            trustCount[t[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (peopleTrustJudge[i] == 0 && trustCount[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}
