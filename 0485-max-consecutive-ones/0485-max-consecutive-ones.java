class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter=0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            // if nums[i] is equal to 0 set counter to 0
            // or else increase counter by one and give it to maxLength
            if(nums[i]==0) counter=0;
            else{
                counter++;
            }
            maxLength=Math.max(maxLength,counter);
        }
        return maxLength;
    }
}