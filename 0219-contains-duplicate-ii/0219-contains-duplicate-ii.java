class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      /* Approach One
        //using HashMap 
        //tc:O(N) and sc:O(N)
       Map<Integer, Integer> map = new HashMap<>();

	for (int i = 0; i < nums.length; i++) {
		if (map.containsKey(nums[i]) &&(i - map.get(nums[i]) <= k))
		return true;
		map.put(nums[i], i);
	}

	return false;
        */
        //Approach Two
        // sliding window and HashSet
        //tc:O(N) and sc:O(N)
        Set<Integer> slidingWindowHash = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (slidingWindowHash.contains(nums[i])) {
                return true;
            }
            slidingWindowHash.add(nums[i]);
            
            if (i >= k) {
                slidingWindowHash.remove(nums[i - k]);
            }
        }
        return false;
    }
}