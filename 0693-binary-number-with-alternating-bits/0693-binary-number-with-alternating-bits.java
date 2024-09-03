class Solution {
    public static boolean hasAlternatingBits(int n) {
        int shifted = n >> 1;
        int xor = n ^ shifted;
        return (xor & (xor + 1)) == 0;
    }
}