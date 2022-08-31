class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        //(nums[nums.length-1]) is the last maximum sorted array
        //(nums[nums.length-2]) is the last second maximum sorted array

     return (nums[nums.length-1]-1)*(nums[nums.length-2]-1) ;
    }
}