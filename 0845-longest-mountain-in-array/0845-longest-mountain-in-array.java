class Solution {
    public int longestMountain(int[] arr) {
        //Time Complexity:O(N)
        //space complexity:O(1)
        int longestmountain=0;
        //peak of the mountain cant be at the zeroth index.
        //peak point should have a lesser neighbor points.
        //first and last elements of an array cant be a peak point because peak of the mountain should have a lesser value neighbor points.
        int i=1;
        while(i<=arr.length-2){
            //looking for neighbor of an element
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                //count must begin from one because we start counting from the peak of the mountain.
                int count=1;
                int j=i;
                while(j>0 && arr[j]>arr[j-1]){
                    count++;
                    j--;
                }
                while(i<arr.length-1 && arr[i]>arr[i+1]){
                    i++;
                    count++;
                }
                longestmountain=Math.max(longestmountain,count);
            }
            else i++;
        }
        return longestmountain;
    }
}