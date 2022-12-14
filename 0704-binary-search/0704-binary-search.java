class Solution {
    public int search(int[] nums, int target) {
        //Using recursion
        int start=0;
        int end=nums.length-1;
        return binarySearch(nums,target,start,end);
    }
    private int binarySearch(int[] array,int target,int start,int end){
        if(start>end) return -1;
        int middle=start+(end-start)/2;
        if(target==array[middle]) return middle;
        else if(target>array[middle]){
            return binarySearch(array,target,middle+1,end);
        }
        else{
            return binarySearch(array,target,start,middle-1);
        }
        /*
        Using just iteration/loop
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int middle=left+(right-left)/2;
            if(nums[middle]==target){
             return middle;
            }
            else if(nums[middle]>target){
                 right=middle-1;
            }
            else{
                left=middle+1;
            }
        }
        return -1;
        */
    }
}