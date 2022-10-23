public class Solution {
	public double findMaxAverage(int[] nums, int k) {
		int windowStart=0;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int windowEnd=0;windowEnd<nums.length;windowEnd++){
            sum+=nums[windowEnd];
    //condition to check if the window has reached the maximum size k
            if(windowEnd-windowStart+1==k){
                //update the maximum sum value calculated upto now
                if(sum>maxSum){//or
                    maxSum=sum;} //maxSum=Math.max(maxSum,sum);
                sum=sum-nums[windowStart];
                windowStart++;
            }
        }
        return (double)maxSum/k;
	}
}