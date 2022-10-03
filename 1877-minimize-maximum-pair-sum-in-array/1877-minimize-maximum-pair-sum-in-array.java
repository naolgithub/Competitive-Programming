class Solution {
    public int minPairSum(int[] nums) {
        //Time Complexity:O(NlogN)
        //Space Complexity:O(1);
        // Two Pointer and Sorting concepts Problem
       // sorting before finding minPairSum
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int max=nums[left]+nums[right];
        while(left<right){
            max=Math.max(max,nums[left]+nums[right]);
            right--;
            left++;
        }
        return max;
    }
}