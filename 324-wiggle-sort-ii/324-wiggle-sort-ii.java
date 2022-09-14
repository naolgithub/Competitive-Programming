class Solution {
    public void wiggleSort(int[] nums) {
        
        // wiggle means to move up and down or from side to side with small rapid movements.
        
        //creating new array called result and storing all elements of nums into it and sorting it.
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++)
            result[i]=nums[i];
        Arrays.sort(result);
        
        int n = nums.length-1;
        // updating elements of nums starting from position one and moving by i=i+2     // 0 2 4 6 .....<--index of nums
        for(int i=1;i<nums.length;i=i+2)
            nums[i]=result[n--];
        // updating elements of nums starting from position zero and moving by i=i+2     // 1 3 5 7 ....<--index of nums
        for(int i=0;i<nums.length;i=i+2)
            nums[i]=result[n--];
    }
}