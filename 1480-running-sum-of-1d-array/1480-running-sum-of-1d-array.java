class Solution {
    public int[] runningSum(int[] nums) {
        /*
    We define a running sum of an array 
    as runningSum[i] = sum(nums[0]…nums[i])
        */
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
           for(int j=0;j<=i;j++){
               sum+=nums[j];
               result[i]=sum;
           }
        }
        return result;
    }
}