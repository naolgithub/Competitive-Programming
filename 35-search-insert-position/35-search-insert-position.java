class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else{
                list.add(target);
            }
        }
        int[] result=new int[list.size()];
        for(int i=0;i<result.length;i++){
            result[i]=list.get(i);
        }
        Arrays.sort(result);
        int value=0;
         for(int i=0;i<result.length;i++){
            if(result[i]==target){
                value=i;
                break;
            }
        }
        return value;
    }
}