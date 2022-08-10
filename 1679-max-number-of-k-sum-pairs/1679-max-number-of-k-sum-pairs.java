class Solution {
public int maxOperations(int[] nums, int k) {
    int counter = 0;
    Arrays.sort(nums); 
    int low = 0;
    int high = nums.length - 1;
    while(low < high){
        if(nums[low] + nums[high] == k){
            counter++;
            low++;
            high--;
        }else if(nums[low] + nums[high] < k){
            low++;
        }else{
            high--;
        }
    }
    return counter;
}
}