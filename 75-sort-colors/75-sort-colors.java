class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);<-- built-in sort function
        
        // we are gonna do it using bubble sorting algorithm
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                } 
            }
        }
    }
}