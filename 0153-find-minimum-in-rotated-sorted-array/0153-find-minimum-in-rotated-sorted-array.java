class Solution {
    public int findMin(int[] nums) {
        //Approach One
        int holder=nums[0];
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            if(nums[left]<nums[right]){
                holder=Math.min(holder,nums[left]);
                break;
            }
            int middle=left+(right-left)/2;
            holder=Math.min(holder,nums[middle]);
            if(nums[middle]>=nums[left]){
                left=middle+1;
            }
            else{
                right=middle-1;
            }
        }
        return holder;
    }
}