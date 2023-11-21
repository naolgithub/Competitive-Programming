class Solution {
    public int smallestEvenMultiple(int n) {
        // check that n is divisable by 2 and return n if true
        if(n % 2 == 0) return n;
        // return n multiply by 2 otherwise
        return n * 2;
    }
}