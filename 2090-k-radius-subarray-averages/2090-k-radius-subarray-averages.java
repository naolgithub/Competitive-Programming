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
        int N = nums.length;
        int[] res = new int[N];
        long sum = 0;
        for (int i = 0; i < N; i++) {
            if (i < k) res[i] = -1;            
            sum += nums[i];
            if (i >= 2*k) {
                res[i - k] = (int)(sum / (2*k + 1));
                sum -= nums[i - 2*k];
            }
			if (i >= N - k) res[i] = -1;
        }
        return res;
    }
}