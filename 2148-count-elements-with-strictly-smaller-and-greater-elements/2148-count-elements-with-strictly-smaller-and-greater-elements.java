class Solution {
    public int countElements(int[] nums) {
        java.util.Arrays.sort(nums);
        if(nums[nums.length-1]==nums[0]) return 0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]) min=nums[i];
            if(max<nums[i]) max=nums[i];
        }
        int countMinimumElements=0;
        int countMaximumElements=0;
        for(int i=0;i<nums.length;i++){
            if(min==nums[i]) countMinimumElements++;
            if(max==nums[i]) countMaximumElements++;
        }
        return nums.length-countMinimumElements-countMaximumElements;
    }
}