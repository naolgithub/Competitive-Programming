class Solution {
    private int search(int[] nums,int target,boolean findStartIndex){
        int positionOfTarget=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]) end=mid-1;
            else if(target>nums[mid]) start=mid+1;
            else{
                //potential position of the target is found but we have got to find the first and last position of it.
                positionOfTarget=mid;
                if(findStartIndex==true){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return positionOfTarget;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] firstAndLastPostionOfElementInSortedArray={-1,-1};
        //finding the first position of the target. 
        int firstPositionOfTarget=search(nums,target,true);
        //finding the last position of the target.
        int lastPositionOfTarget=search(nums,target,false);
        firstAndLastPostionOfElementInSortedArray[0]=firstPositionOfTarget;
        firstAndLastPostionOfElementInSortedArray[1]=lastPositionOfTarget;
        return firstAndLastPostionOfElementInSortedArray;
    }
}