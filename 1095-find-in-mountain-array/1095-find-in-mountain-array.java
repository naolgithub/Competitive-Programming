/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int peak = peakIndex(mountainArr);
        int leftHalf = binarySearch(target, mountainArr, 0, peak);
        if(leftHalf!=-1){
            return leftHalf;
        }else{
            return binarySearch(target,mountainArr, peak+1, mountainArr.length()-1);
        }
        
    }
    
    public int peakIndex(MountainArray mountainArr){
        int start =0;
        int end = mountainArr.length()-1;
            
        while(start<end){
            int mid = start + (end-start)/2;
            
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    
    public int binarySearch(int target,MountainArray mountainArr,int start, int end){
        
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        
        while(start<=end){
            
            int mid = start + (end-start)/2;
            
            if(target == mountainArr.get(mid)){
                return mid;
            }
            if(isAsc){
                if(target < mountainArr.get(mid)){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            else{
                if(target > mountainArr.get(mid)){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}