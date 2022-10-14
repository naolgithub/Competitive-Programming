class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        /*
        //Time Limit Exceeded Solution
        int count=0;
     for(int i=0;i<nums.length;i++){
         int sum=0;
         for(int j=i;j<nums.length;j++){
            sum+=nums[j];
             if(sum%k==0) count++;
         }
     }   
        return count;
        */
        /*
        We need to track the frequency of the orccurence of remainder of the cumulative sum.
        If a remainder occurs twice, it means the sum between these 2 are divisible by k, and hence the subarray
        between these two adds to the solution.
        
        1. Keep getting the cumulative sum
        2. Calculate the remainder and add K to it if it is negative
        3. If the remainder has occured before, it means anything between these two, plus the number of times the remainder came before, those many sub arrays are divisible by k. 
        So add the already seen frequency to the response
        4. Update the frequency now and continue
        
        Note: 0 is seen once in the beginning, ie, when no element is added in cumSum, cumSum = 0 and so 0 has to initialize with frequency 1
        */
        Map<Integer, Integer> freqMap = new HashMap<>();
        freqMap.put(0,1);
        int cumSum = 0;
        
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            cumSum +=nums[i];
            int remainder = cumSum%k < 0? cumSum%k + k : cumSum%k;
            if(freqMap.containsKey(remainder)) {
                count+=freqMap.get(remainder);
            }
            freqMap.put(remainder, freqMap.getOrDefault(remainder, 0)+1);
        }
        return count;
    }
}