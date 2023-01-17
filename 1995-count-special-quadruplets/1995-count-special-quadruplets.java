class Solution {
    public int countQuadruplets(int[] nums) {
        int quadruplet=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){
                    for(int l=0;l<nums.length;l++){
                        if(i<j && j<k && k<l){
                            if(nums[l]==nums[i]+nums[j]+nums[k]){
                                quadruplet++;
                            }
                        }
                    }
                }
            }
        }
        return quadruplet;
    }
}