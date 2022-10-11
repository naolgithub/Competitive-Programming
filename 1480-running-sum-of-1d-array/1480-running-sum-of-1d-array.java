class Solution {
    public int[] runningSum(int[] nums) {
        /*
        Time Complexity:O(N)
        Space Complexity:O(1)
        */
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}