/*
class Solution {
    public int[] getAverages(int[] nums, int k) {
        if(k<=0) return nums;
        int[] result=new int[nums.length];
        int windowStart=0;
        long currentSum=0;
        for(int windowEnd=0;windowEnd<nums.length;windowEnd++){
            currentSum+=nums[windowEnd];
            if(windowEnd-windowStart>=2*k){
                long average=currentSum/(2*k+1);
                // or 
                //int average=currentSum/(windowEnd-windowStart+1);
                result[windowEnd-k]=(int)average;
                currentSum-=nums[windowEnd-2*k];
            }
        }
        for(int i=0;i<result.length;i++){
            if(result[i]==0) result[i]=-1;
        }
        return result;
    }
}
*/
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] result = new int[nums.length];
        long currentSum = 0;
        int windowStart=0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            if (windowEnd < k) result[windowEnd] = -1;            
            currentSum += nums[windowEnd];
            if (windowEnd >= 2*k) {
                result[windowEnd - k] = (int)(currentSum / (2*k + 1));
                currentSum -= nums[windowStart++];
            }
			if (windowEnd >= nums.length - k) result[windowEnd] = -1;
        }
        return result;
    }
}