class Solution {
    public int removeDuplicates(int[] nums) {
       Set<Integer> set=new HashSet();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        List<Integer> list=new ArrayList();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                count++;
                list.add(nums[i]);
                set.remove(nums[i]);
            }
        }
        //int[] array=new int[list.size()];
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return count;
    }
}