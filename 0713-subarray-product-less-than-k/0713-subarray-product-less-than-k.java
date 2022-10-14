class Solution {
public int numSubarrayProductLessThanK(int[] nums, int k) {

    if(k<=1) return 0;
    int count = 0;
    int product = 1;
    int left =0;
    int right=0;
    while(right < nums.length){
        product *= nums[right];
       // if product is greater than k than we need to shrink the window size and move left pointer towards right
        while(product >= k){
            product /= nums[left];
            left++;
        }
// if product is less than k than we need to increase the count
        count += (right-left)+1; // basically it is used to find the length of the current window
         right++;
    }
       return count;
}
}