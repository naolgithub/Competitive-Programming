class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        // adding all elements in the HashSet
        for(Integer i: nums){
            s.add(i);
        }
        
        int i=0;
        
        // checking the elements of hashset with the series of positive number(Z+)
        // the range of Z+ begin from the one(1) and up to the given nums.length
        // so in the for loop we begin from the int i=1;
        for(i=1;i<=nums.length;i++){
            if(!s.contains(i)) return i;
        }
        return i;
    }
}