class Solution {
    public int[] searchRange(int[] nums, int target){
       List<Integer> list=new ArrayList<>();
        //STORING ELEMENTS INTO ArrayList
       for(int i=0;i<nums.length;i++){
           if(nums[i]==target){
               list.add(i);
           }
       }
        // STORING ELEMENTS IN ArrayList into Array
        int[] search=new int[list.size()];
        for(int i=0;i<list.size();i++){
            search[i]=list.get(i);
        }
        // FINDING THE MAX==last-position AND MIN==first-position OF THE OF THE SORTED ARRAY if ArrayList is not empty
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
        // assigning min and max into result
        int [] result={min,max};
        // assigning -1 and -1 into targetNotFoundArray if ArrayList is empty.
        int[] targetNotFoundArray={-1,-1};
        if(!list.isEmpty()){
        return result;
         }
       else
          return targetNotFoundArray;  
    }
}