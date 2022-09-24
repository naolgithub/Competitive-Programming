class Solution {
    public int[] sortedSquares(int[] nums) {
        /*
        Method One
        
        // TIME COMPLEXITY :O(NlogN)
        // space complexity :O(N)
        int[] squaredArray=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            squaredArray[i]=nums[i]*nums[i];
        }
        //now sort the squaredArray
        Arrays.sort(squaredArray);
        return squaredArray;
        */
        
         /*
        Method Two
        //Here we dont have to create another space for storage
        // TIME COMPLEXITY :O(NlogN)
        // space complexity :O(1)
        int count=0;
        for(int i=0;i<nums.length;i++){
            nums[count++]=nums[i]*nums[i];
        }
        //now sort the squaredArray
        Arrays.sort(nums);
        return nums;
        */
        
        
        
        // Method Three
        // we have to remember that nums array might have negative
        // time complexity : O(N)
        // space complexity : O(N)
        int[] sortedArray=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[left])>nums[right]){
                sortedArray[i]=nums[left]*nums[left];
                left++;
            }
            else{
                sortedArray[i]=nums[right]*nums[right];
                right--;
            }
        }
        return sortedArray;
    }
}