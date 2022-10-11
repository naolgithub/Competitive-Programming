class Solution {
    public int[] sortEvenOdd(int[] nums) {
        /*
        //METHOD ONE
        // Time Complexity:O(N^2)
        // Space Complexity:O(1)
    //after sorting of evenodd, the answer contains:
    //even indices are sorted in increasing order
    // odd indices are sorted in decreasing order
        for(int i=1;i<nums.length;i+=2){
        for(int j=i+2;j<nums.length;j+=2){
            if(nums[i]<=nums[j]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
    }
         for(int i=0;i<nums.length;i+=2){
        for(int j=i+2;j<nums.length;j+=2){
            if(nums[i]>=nums[j]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
    }
    return nums;
    */
        //Method Two 
        //Time Complexity:O(NlogN)
        //Space Complexity:O(N)
        //after sorting of evenodd, the result contains:
    //even indices are sorted in increasing order
    // odd indices are sorted in decreasing order
        if(nums.length<3) return nums;
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if (i%2 == 0) 
                even.add(nums[i]);
                else 
                odd.add(nums[i]);
            }
        
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
		
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
             if (i%2 == 0){
               result[i]=even.get(j);
                 j++;
             }
             else {
               result[i]=odd.get(k);
                 k++;
             }
        }
        return result;
    }
}