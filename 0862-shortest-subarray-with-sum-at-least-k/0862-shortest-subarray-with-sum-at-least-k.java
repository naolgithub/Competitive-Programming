class Solution {
    public int shortestSubarray(int[] nums, int k) {
        long[] prefixSum=new long[nums.length+1];
        for(int i=0;i<nums.length;i++){
            prefixSum[i+1]=prefixSum[i]+nums[i];
        }
        int result=Integer.MAX_VALUE;
        LinkedList<Integer> queue = new LinkedList();
        for(int i=0;i<=nums.length;i++){
            while(!queue.isEmpty() && prefixSum[i]<=prefixSum[queue.peekLast()]){
                queue.removeLast();
            }
            while(!queue.isEmpty() && prefixSum[i]-prefixSum[queue.peekFirst()]>=k){
                result=Math.min(result,i-queue.removeFirst());
            }
            queue.offerLast(i);
        }
        return result==Integer.MAX_VALUE? -1 : result;
    }
}