class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        char[] resultArr = new char[length1 + length2];
        // Two pointers are maintained which will be used to 
        // fetch the characters in alternating order.       
        int pointer1 = 0;
        int pointer2 = 0;
        int resultPointer = 0;
        
        //When either of the word's traversal is completed then loop
        //will only consider the other word.
        while (pointer1 < length1 || pointer2 < length2) {
            if (pointer1 < length1) {
                resultArr[resultPointer] = word1.charAt(pointer1);
                pointer1++;
                resultPointer++;
            }
            if (pointer2 < length2) {
                resultArr[resultPointer] = word2.charAt(pointer2);
                pointer2++;
                resultPointer++;
            }
        }
        return new String(resultArr);
    }
}