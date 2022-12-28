class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        //check for the first occurrence of the target
        int firstOccurrence=search(nums,target,true);
        //check for the last occurrence of the target
        int lastOccurrence=search(nums,target,false);
        ans[0]=firstOccurrence;
        ans[1]=lastOccurrence;
        return ans;
    }
    private int search(int[] nums,int target,boolean isFirstOccurrence){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]) end=mid-1;
            else if(target>nums[mid]) start=mid+1;
            else{
                ans=mid;
                if(isFirstOccurrence){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}







