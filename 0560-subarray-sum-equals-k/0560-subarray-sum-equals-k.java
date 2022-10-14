class Solution {
    public int subarraySum(int[] nums, int k) {
      // nick white
      // https://youtu.be/AmlVSNBHzJg
        
     Map<Integer,Integer> arraySums=new HashMap<>();
        int sum=0;
        int result=0;
        arraySums.put(0,1);// assuming key 0 has 1 value
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(arraySums.containsKey(sum-k)){
                result+=arraySums.get(sum-k);
            }
            arraySums.put(sum,arraySums.getOrDefault(sum,0)+1);
        }
        return result;
        /*
           // Time Limit Exceeded Solution
        int count=0;
       for(int i=0;i<nums.length;i++){
           int sum=0;
           for(int j=i;j<nums.length;j++){
               sum+=nums[j];
               if(sum==k) count++;
           }
       } 
        return count;
   */
    }
}