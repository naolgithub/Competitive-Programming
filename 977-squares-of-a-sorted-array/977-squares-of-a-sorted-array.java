class Solution {
    public int[] sortedSquares(int[] nums) {
        //THIS IS INEFFICIENT SINCE IT TAKES
        // TIME COMPLEXITY :O(NlogN)
        // space complexity :O(N)
        //int[] squaredArray=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            nums[count++]=nums[i]*nums[i];
        }
        //now sort the squaredArray
        Arrays.sort(nums);
        return nums;
    }
}