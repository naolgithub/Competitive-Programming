/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    private int OrderAgnosticBinarySearch(int target,MountainArray mountainArr,int start,int end){
        boolean isAscending=mountainArr.get(start)<mountainArr.get(end);
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)==target) return mid;
            if(isAscending){
            if(mountainArr.get(mid)>target) end=mid-1;
            else start=mid+1;
            }
            else{
                if(mountainArr.get(mid)<target) end=mid-1;
                else start=mid+1;
            }
        }
        return -1;
    }
    private int findPeakOfMountain(MountainArray mountainArr){
        //at the final both start and end points to the same element
        //when we find the peak of the mountain.
        int start=0;
        int end=mountainArr.length()-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end=mid;
            }
            else start=mid+1;
        }
        return start;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        //finding peak of the mountain.
        int peakOfMountain=findPeakOfMountain(mountainArr);
        
        //if our target is  on the left side of the peak
            int leftSideTarget=OrderAgnosticBinarySearch(target,mountainArr,0,peakOfMountain);
        if(leftSideTarget!=-1) return leftSideTarget;
        
        //if our target is on the right side of the peak
            else return OrderAgnosticBinarySearch(target,mountainArr,peakOfMountain+1,mountainArr.length()-1);
       
    }
}