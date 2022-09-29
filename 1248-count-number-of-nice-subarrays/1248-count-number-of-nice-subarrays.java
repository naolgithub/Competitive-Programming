
/*
https://leetcode.com/problems/count-number-of-nice-subarrays/discuss/2619352/JAVA-solution-or-Current-problem-transformed-to-Problem-560-or-HashMap
*/
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int total = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] % 2 == 0) ? 0 : 1;
            int rem = sum - k;

            if (map.containsKey(rem)) {
                total += map.get(rem);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return total;
    }
}