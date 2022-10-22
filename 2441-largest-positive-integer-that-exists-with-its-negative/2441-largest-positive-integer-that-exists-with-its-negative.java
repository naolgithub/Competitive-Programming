class Solution {
    public int findMaxK(int[] nums) {
        //using hashing(hash table)
        Set<Integer> set= new HashSet();
        for(int num:nums) set.add(num);
        //since we return -1 if there is no largestPositiveNegative Integer,we assign -1 to largestPosNeg.
        int largestPosNeg=-1;
        for(int i:nums){
            if(i>0 &&set.contains(-i)){
               largestPosNeg=Math.max(largestPosNeg,i); 
            }
        }
        return largestPosNeg;
        /*
        //using nested loops and sorting
       Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j>=0; j--) {
                if(nums[i]+nums[j]==0)return nums[j];
            }
        }
        return -1;
        */
    }
}