/*
Get the frequency and sort them in descending order.
While the total elements are less than required add them and increment our sets.
Return minimumSets.
TC : O(N log N) + O(N) ~ O(N log N)
SC : 2 * O(N) ~ O(N)
    */
class Solution {

    public int minSetSize(int[] arr) {
        
        //Hint 1:Count the frequency of each integer in the array.
                //we use HashMap here
        
        //Hint 2:Start with an empty set, add to the set the integer with the maximum frequency.
                //we use list and store maximum frequency here
        
        //Hint 3:Keep Adding the integer with the max frequency until you remove at least half of the integers.
        
        int requiredHalfSize = arr.length / 2;
        int currentSize = 0;
        int minimumSet = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        //Element and its frequency
        for (int element : arr) map.put(element, map.getOrDefault(element, 0) + 1);

        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());

        while (currentSize < requiredHalfSize) {
            currentSize += list.remove(0);
            minimumSet++;
        }

        return minimumSet;
    }
}

