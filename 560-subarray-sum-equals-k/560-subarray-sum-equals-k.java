class Solution {
    // nick white
    // https://youtu.be/AmlVSNBHzJg
    public int subarraySum(int[] nums, int k) {
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
    }
}