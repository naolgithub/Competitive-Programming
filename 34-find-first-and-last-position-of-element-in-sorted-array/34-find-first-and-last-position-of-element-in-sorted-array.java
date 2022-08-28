class Solution {
    public int[] searchRange(int[] nums, int target){
       List<Integer> list=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
           if(nums[i]==target){
               list.add(i);
           }
       }
        int[] search=new int[list.size()];
        for(int i=0;i<list.size();i++){
            search[i]=list.get(i);
        }
        int max=0,min=0;
        if(!list.isEmpty()) {
            max=search[0];
        for(int i=0;i<search.length;i++){
            if(max<search[i]){
                max=search[i];
            }
        }
             min=search[0];
        for(int i=0;i<search.length;i++){
            if(min>search[i]){
                min=search[i];
            }
        }
           }     
        int [] result={min,max};
        int[] targetNotFoundArray={-1,-1};
        if(!list.isEmpty()){
        return result;
         }
       else
          return targetNotFoundArray;  
    }
}