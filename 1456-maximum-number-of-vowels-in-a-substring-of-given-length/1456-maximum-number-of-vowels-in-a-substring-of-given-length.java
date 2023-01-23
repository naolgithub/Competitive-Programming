class Solution {
    private boolean containsVowel(char character){
        return (character=='a' || character=='e' || character=='i' || character=='o' || character=='u') ;
    }
    public int maxVowels(String s, int k) {
        int maxNumberOfVowels=0;
        int windowStart=0;
        int currentNumberOfVowels=0;
        for(int windowEnd=0;windowEnd<s.length();windowEnd++){
            if(containsVowel(s.charAt(windowEnd))) {
                currentNumberOfVowels++;
            }
            if(windowEnd-windowStart+1==k){
                maxNumberOfVowels=Math.max(maxNumberOfVowels,currentNumberOfVowels);
                if(containsVowel(s.charAt(windowStart))){
                    currentNumberOfVowels--;
                }
                windowStart++;
            }
        }
        return maxNumberOfVowels;
    }
}