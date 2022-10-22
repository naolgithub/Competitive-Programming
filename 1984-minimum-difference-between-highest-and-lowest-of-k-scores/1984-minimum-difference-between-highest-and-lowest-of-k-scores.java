class Solution {
    public int minimumDifference(int[] nums, int k) {
        //using sorting and sliding window
        if(nums.length==1){
          return 0; 
       }
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int difference = 0;
        for(int i = k-1;i<nums.length;i++){
            difference = nums[i] - nums[i-(k-1)];
            min = Math.min(min,difference);
        }
        return min;
    }
}