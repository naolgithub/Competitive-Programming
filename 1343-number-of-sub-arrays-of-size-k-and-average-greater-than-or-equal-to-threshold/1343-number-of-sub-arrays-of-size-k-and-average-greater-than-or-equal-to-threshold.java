class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowStart=0;
        int count=0;
        int sum=0;
        for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
            sum+=arr[windowEnd];
            if(windowEnd-windowStart+1==k){
                if((sum/k)>=threshold){
                    count++;
                }
                sum=sum-arr[windowStart];
                    windowStart++;
            }
        }
        return count;
    }
}