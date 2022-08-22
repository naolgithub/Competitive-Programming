class Solution {
    public int missingNumber(int[] nums) {
       
        int sum=0;
        // adding all full elements from [0...n]
        for(int i=0;i<=nums.length;i++)
        {
            sum+=i;
        }
        // minusing nums from sum using for loop and finally we get the missed element
        for(int i=0;i<nums.length;i++)
        {
            sum=sum-nums[i];
        }
     return sum;
        
    }
    }
