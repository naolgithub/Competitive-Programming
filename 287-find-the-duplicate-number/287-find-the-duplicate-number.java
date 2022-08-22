class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> storeNums=new HashSet<>();
        for(int num:nums){
            if(storeNums.contains(num)) return num;
            storeNums.add(num);
        }
        return 0;
    }
}