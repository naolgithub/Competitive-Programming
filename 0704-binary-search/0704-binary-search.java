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
    }
}