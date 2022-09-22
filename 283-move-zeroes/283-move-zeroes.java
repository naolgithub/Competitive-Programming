class Solution {
    public void moveZeroes(int[] nums) {
    // If the current element is not 0, then we need to
    // append it just in front of last non 0 element we found. 
         int noneZeroIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[noneZeroIndex++]=nums[i];
            }
        }
    // After we have finished processing new elements,
 	// all the non-zero elements are already at beginning of array.
 	// We just need to fill remaining array with 0's.
        for(int i=noneZeroIndex;i<nums.length;i++){
            nums[i]=0;
        }
    }
}