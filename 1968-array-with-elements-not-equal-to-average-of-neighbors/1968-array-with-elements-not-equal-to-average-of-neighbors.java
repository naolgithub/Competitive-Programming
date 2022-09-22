class Solution {
    // time complexity:O(NLogN)
    // space complexity:O(1)
    public int[] rearrangeArray(int[] nums) {
        
    //Array With Elements Not Equal to Average of Neighbors
       Arrays.sort(nums);//-->>TC=O(nlogn)
	   // sorting in wave format
// i<nums.length-1  --->>> makes array not to go out of bounds 
        for(int i = 0;i<nums.length-1;i+=2){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        return nums;
    }
}