class Solution {
    public int maximumUniqueSubarray(int[] nums) {
          // using hashset
          int start = 0;
          int end = 0;
          int sum = 0;
          int result = 0;
          HashSet<Integer> set = new HashSet<>();
          while (end < nums.length) {
             if (!set.contains(nums[end])) {
                 sum += nums[end];
                 set.add(nums[end]);
                 end++;
                 result = Math.max(result, sum);
             } else {
                 sum -= nums[start];
                 set.remove(nums[start]);
                 start++;
             }
         }
         return result;
    }
}