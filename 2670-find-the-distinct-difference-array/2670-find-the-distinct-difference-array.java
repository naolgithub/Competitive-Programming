class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] difference=new int[nums.length];
        HashSet<Integer> distinctElements=new HashSet();
        int[] suffixDistinct=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            distinctElements.add(nums[i]);
            suffixDistinct[i]=distinctElements.size();
        }
        distinctElements.clear();
        for(int i=0;i<nums.length;i++){
            distinctElements.add(nums[i]);
            int prefixDistinct=distinctElements.size();
            difference[i]=prefixDistinct-(i < nums.length - 1 ? suffixDistinct[i + 1] : 0);
        }
        return difference;
    }
}