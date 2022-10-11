class Solution {
    // link:https://leetcode.com/problems/last-stone-weight/discuss/2433222/Java-Easiest-Solution-oror-3Ms-Runtime-Beginner-Friendly-Approach-oror-High-Runtime-Easy-Approch
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i: stones){
            arr.add(i);
        }
        while(arr.size() > 1){
            Collections.sort(arr);   
            int size = arr.size();
            int max = arr.get(size-1);
            int min = arr.get(size-2);
            arr.remove(size-1);
            arr.remove(size-2);
            if(min != max){
                max = max - min;
                arr.add(max);
            }
        }
        return arr.size()==1?arr.get(0):0;
    }
}