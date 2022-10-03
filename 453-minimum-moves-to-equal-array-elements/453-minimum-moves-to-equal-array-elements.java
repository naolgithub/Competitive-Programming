class Solution {
    /*
    https://leetcode.com/problems/minimum-moves-to-equal-array-elements/discuss/2217319/Java-easy-solution-O(n)-Similar-Question%2B
    */
    // Here, we can increment only n-1 elements so, just take the minimum and find out absolute sum difference of each from minimum.
    // tc:O(n)
    //sc: O(1)

    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        
        for(int i : nums) {
            min = Math.min(min, i);
        }
        for(int i : nums) {
            count += Math.abs(i - min);
        }
        
        return count;
    }
}