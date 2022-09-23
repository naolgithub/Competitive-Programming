class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int slices = 0;
	for (int i = 2, prev = 0; i < nums.length; i++){
		if(nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
            prev=prev+1;
            slices=slices+prev;
        }
        else{
            prev=0;
        }
    }
	return slices;
    }
}