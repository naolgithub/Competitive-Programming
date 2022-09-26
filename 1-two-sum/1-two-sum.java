class Solution {
    public int[] twoSum(int[] nums, int target) {
        // we use a map to store the already looped values
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            int key = target - nums[i];
            // we substract the loop num to the target
            // if the map already contains the key, means we found the answer
            if(hashMap.containsKey(key)){
                result[0] = hashMap.get(key);
                result[1] = i;
                return result;
            }
            // if does not contain, we store it to check in later iterations
            hashMap.put(nums[i], i);
        }
        return result;
    }
}