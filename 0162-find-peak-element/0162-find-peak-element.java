class Solution {
        private int search(int[] arr,int start, int end){
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) end=mid;
            else if(arr[mid]<arr[mid+1]) start=mid+1;
        }
        return end;
    }
    public int findPeakElement(int[] nums) {
     return search(nums,0,nums.length-1);   
    }
}