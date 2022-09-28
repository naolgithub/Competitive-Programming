class Solution {
    public int pivotIndex(int[] nums) {
        // rightSum is the total sum
        // we substract from the rightSum until rightSum ==leftSum and we also sum up an elements to leftSum until that and we return index
		int rightSum=0;
        int leftSum=0;
		for(int i=0;i<nums.length;i++)   {
			rightSum+=nums[i];
			}
        
		for(int i=0;i<nums.length; i++)
		{
			rightSum-=nums[i];
			if(rightSum==leftSum){
                return i;
            }
			leftSum+=nums[i];
		}
		return -1;
    }
}