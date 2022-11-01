class Solution {
    public int longestSubarray(int[] nums, int limit) {
          int left = 0;
          int right;
         TreeMap<Integer, Integer> map = new TreeMap<>();
      for (right = 0; right < nums.length; right++) {
        map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
       if (map.lastEntry().getKey() - map.firstEntry().getKey() > limit) {
                 map.put(nums[left], map.get(nums[left]) - 1);
                 if (map.get(nums[left]) == 0) {
                     map.remove(nums[left]);
                 }
                 left++;
             }
         }
         return right - left;
    }
}