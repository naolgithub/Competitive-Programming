class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
      List<Integer> list =new ArrayList<>();
      for(int i=0;i<nums.length;i++){
          list.add(index[i],nums[i]);
      }
       //int[] array=new int[index.length];
       //or
      int[] array=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            array[i]=list.get(i);
        }
        return array;
    }
}