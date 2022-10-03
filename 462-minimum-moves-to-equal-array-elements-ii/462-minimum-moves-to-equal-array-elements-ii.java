class Solution {
    /*
    https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/discuss/2215782/Visual-Explanation-%2B-Interview-Tips-or-JAVA
    */
    public int minMoves2(int[] nums) {
    Arrays.sort(nums);
	int operations = 0;
        //finding median 
    int median = nums[nums.length/2];
        //adding into operations the  absolute difference between median and every elements of nums array i.e |median-nums[i]|
	for (int i=0;i<nums.length;i++) {
        operations += Math.abs(median - nums[i]);
     }
	return operations;  
    }
}