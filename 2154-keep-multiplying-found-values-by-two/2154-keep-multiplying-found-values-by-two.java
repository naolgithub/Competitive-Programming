class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> findValue=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            findValue.add(nums[i]);
        }
        while(findValue.contains(original)){
            original=2*original;
        }
        return original;
    }
}