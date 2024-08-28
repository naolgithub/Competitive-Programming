class Solution {
    public static int[] countBits(int n) {
        int[] countBitsArray = new int[n + 1];  
        for (int i = 1; i <= n; i++) {
            countBitsArray[i] = countBitsArray[i >> 1] + (i & 1);
        }
        return countBitsArray;
    }
}