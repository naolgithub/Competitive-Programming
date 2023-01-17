class Solution {
    public int unequalTriplets(int[] nums) {
        int unequalTriplet=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){
                    if(i<j && j<k){
                        if(nums[i]!=nums[j] && nums[i]!=nums[k]&& nums[j]!=nums[k]){
                            unequalTriplet++;
                        }
                    }
                }
            }
        }
                                                                       return unequalTriplet;
    }
}