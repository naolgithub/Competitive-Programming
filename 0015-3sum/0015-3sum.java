class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList();
        
        for(int i=0; i<nums.length-2; i++){
            if(i==0 || (i>0 && nums[i] != nums[i-1])/*to deal with duplicates*/){
                int low=i+1;
                int high = nums.length-1;
                int sum = 0-nums[i];
                // -4 -1 -1 0 1 2  
                while(low<high){
                    if(nums[low]+nums[high]==sum){
                        list.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        // to deal with duplicates
                        while(low<high && nums[low]==nums[low+1]) low++; 
                        while(low<high && nums[high]==nums[high-1])high--;
                        
                        low++;
                        high--;
                    }
                    else if(nums[low]+nums[high] > sum){
                        high--;
                    }
                    else{
                        low++;
                    }
                }
            }
        }
        return list;
    }
}