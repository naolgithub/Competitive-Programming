class Solution {
    private boolean isDistinct(char a, char b){
        return a!=b;
    }
    public int longestBeautifulSubstring(String word) {
        //The minimum length of maxLen is 0 becaus of (i.e If no such substring exists, return 0)
        int maxLen = 0;
        int count = 1;
        int wordLengthSoFar = 1;
        for(int i = 1;i<word.length();i++){
            if(word.charAt(i-1) <= word.charAt(i)){
                if(isDistinct(word.charAt(i-1), word.charAt(i))){
                    count++;
                     }
                wordLengthSoFar++;
                if(count == 5){
                    maxLen = Math.max(maxLen, wordLengthSoFar);
                       }
            }
            else{
                count = 1;
                wordLengthSoFar = 1;
                }
        }
        return maxLen;
    }
}