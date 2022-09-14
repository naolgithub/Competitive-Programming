class Solution {
    public int[] rearrangeArray(int[] nums) {
    //Array With Elements Not Equal to Average of Neighbors
       Arrays.sort(nums);
	   // sorting in wave format
        for(int i = 0;i<nums.length-1;i+=2){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        return nums;
    }
}