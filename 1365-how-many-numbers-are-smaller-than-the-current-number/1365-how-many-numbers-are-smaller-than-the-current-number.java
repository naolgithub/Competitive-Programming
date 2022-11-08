class Solution {
    //https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/discuss/535421/Java-Clean-HashMap-solution-with-explanation
    public int[] smallerNumbersThanCurrent(int[] nums) {
        /*
        The putIfAbsent(K key, V value) method of HashMap class is used to map the specified key with the specified value, only if no such key exists (or is mapped to null)  in this HashMap instance.
        */
        //1.Create a copy of the input array. copy = [8,1,2,2,3]
        //2.Sort the copy array. copy = [1,2,2,3,8]
        /*
        3.Fill the map: number => count (where count is an index in sorted array, so first number with index 0 has 0 numbers less than it, index 1 has 1 number less, etc). We update only first time we enocunter the number so that way we skip duplicates.
map[1]=>0
map[2]=>1
map[3]=>3
map[8]=>4
        */
        /*
        4.We re-use our copy array to get our result, we iterate over original array, and get counts from the map.
[4,0,1,1,3]
        */
       Map<Integer, Integer> map = new HashMap<>();
        int[] copy = nums.clone();
        
        Arrays.sort(copy);
        
        for (int i = 0; i < copy.length; i++) {
            map.putIfAbsent(copy[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            copy[i] = map.get(nums[i]);
            //nums[i] = map.get(nums[i]);
        }
        
        return copy;
        //return nums;
 
    }
}