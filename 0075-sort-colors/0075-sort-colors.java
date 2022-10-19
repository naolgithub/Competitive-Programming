class Solution {
    public void sortColors(int[] nums) {
     int numberOfZeroes=0;
            int numberOfOnes=0;
            int numberOfTwos=0;
            for(int i=0;i<nums.length;i++){
                    if(nums[i]==0) numberOfZeroes++;
                    else if(nums[i]==1) numberOfOnes++;
                    else if(nums[i]==2) numberOfTwos++;
            }
            for(int i=0;i<numberOfZeroes;i++){
                    nums[i]=0;
            }
            for(int i=numberOfZeroes;i<nums.length-numberOfTwos;i++){
                    nums[i]=1;
            }
        for(int i=nums.length-numberOfTwos;i<nums.length;i++){
                    nums[i]=2;
            }
    }
}