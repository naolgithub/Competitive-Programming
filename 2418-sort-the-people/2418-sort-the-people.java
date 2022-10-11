class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap();
        for(int i=0; i<heights.length; i++){
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] result = new String[heights.length];
        int counter=0;
        while(counter<heights.length){
            result[counter] = map.get(heights[heights.length-counter-1]);
            counter++;
        }
        return result;
    }
}