import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
      BigInteger[] arr = new BigInteger[nums.length];
        for(int i=0;i<arr.length;i++){
           arr[i]=new BigInteger(nums[i]);
        }
        Arrays.sort(arr);
        return arr[arr.length-k].toString();
    }
}