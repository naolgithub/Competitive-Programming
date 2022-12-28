class Solution {
    public int countElements(int[] nums) {
        //considering all the given hints
        /*
        1.All the elements in the array should be counted except for the minimum and maximum elements.
        2.If the array has n elements, the answer will be n - count(min(nums)) - count(max(nums))
        3.This formula will not work in case the array has all the elements equal, why?
        */
        Arrays.sort(nums);
        //if the array has all the elements equal.
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