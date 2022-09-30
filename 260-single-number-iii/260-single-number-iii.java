class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> hashSet=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(hashSet.contains(nums[i])){
                hashSet.remove(nums[i]);
            }
            else{
                hashSet.add(nums[i]);
            }
        }
        for(int i:hashSet){
            list.add(i);
        }
        int[] array=new int[list.size()];
        for(int i=0;i<list.size();i++){
            array[i]=list.get(i);
        }
        return array;
    }
}