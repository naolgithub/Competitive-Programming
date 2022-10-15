class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] resultArray = new char[word1.length() + word2.length()];
        // Two pointers are maintained which will be used to 
        // fetch the characters in alternating order.       
        int pointer1 = 0;
        int pointer2 = 0;
        int resultPointer = 0;
        
        //When either of the word's traversal is completed then loop
        //will only consider the other word.
        while (pointer1 < word1.length() || pointer2 < word2.length()) {
            if (pointer1 < word1.length()) {
                resultArray[resultPointer] = word1.charAt(pointer1);
                pointer1++;
                resultPointer++;
            }
            if (pointer2 < word2.length()) {
                resultArray[resultPointer] = word2.charAt(pointer2);
                pointer2++;
                resultPointer++;
            }
        }
        return new String(resultArray);
    }
}