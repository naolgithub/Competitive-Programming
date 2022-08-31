class Solution {
    public int dominantIndex(int[] nums) {
          int max = nums[0];
          int position = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i = 0 ; i<nums.length ; i++) {
            if(nums[i] != max && nums[i] * 2 > max) return -1;
            if(nums[i] == max) position = i;
        }
        return position;
    }
}