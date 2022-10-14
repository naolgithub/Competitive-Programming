class Solution {
public int numSubarrayProductLessThanK(int[] nums, int k) {
   /*
As per given constrant : k>=0 and values in array can be in between 0 to 1000.
As we want subarrays whose product are strictly less than k.
so if(k<=1) return 0.
and luckily here you dont have the problem that product of number is exceeding the Integer.Max Range i.e k is up to 10^6.
   */
    // optimised solution
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

// brute force solution
/*
    int count =0;
    for(int i=0;i<nums.length;i++){
        int product =1;
        for (int j=i;j<nums.length;j++){
            product *= nums[j];
            if (product < k){
                count++;
            }else{
                break;
            }
        }
    }
     return count;
*/
}
}