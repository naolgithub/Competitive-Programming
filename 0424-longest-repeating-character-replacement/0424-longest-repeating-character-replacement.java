class Solution {
    public int characterReplacement(String s, int k) {
        char[] array=s.toCharArray();
        int windowStart=0;
        //Define hashmap
        Map<Character,Integer> map=new HashMap();
        int maxLength=0;
        int mostFrequent=0;
        //mostFrequent-is the number of characters in our window right now that need to be replaced
        //finding the most frequent character replacement
        for(int windowEnd=0;windowEnd<array.length;windowEnd++){
            //expand the window
            map.put(array[windowEnd],map.getOrDefault(array[windowEnd],0)+1);
            mostFrequent=Math.max(mostFrequent,map.get(array[windowEnd]));
            //shrink the window if we need to replace more than k character
            if((windowEnd-windowStart+1)- mostFrequent>k){
                map.put(array[windowStart],map.get(array[windowStart])-1);
                windowStart++;
            }
            maxLength=Math.max(maxLength,windowEnd-windowStart+1);
        }
        return maxLength;
    }
}