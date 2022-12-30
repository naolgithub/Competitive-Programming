class Solution {
    private int search(int[] arr,int start, int end){
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) end=mid;
            else if(arr[mid]<arr[mid+1]) start=mid+1;
        }
        return start;
    }
    public int peakIndexInMountainArray(int[] arr) {
        return search(arr,0,arr.length-1);
    }
}