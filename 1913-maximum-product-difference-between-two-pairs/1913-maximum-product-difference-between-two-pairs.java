class Solution {
    public int maxProductDifference(int[] nums) {
        // sorting array
        Arrays.sort(nums);
        //(nums[nums.length-1]) is the last max element
        //(nums[nums.length-1]) is the last 2nd max element
        //(nums[0]) is the smallest first element
        //(nums[1]) is the small element greater than nums[0]
        return (nums[nums.length-1]*nums[nums.length-2])-(nums[0]*nums[1]);

    }
}