class Solution {
    public int maxPower(String s) {
        /*
        In other words, we need to find the Longest Substring with the same characters.
        */
        int count = 0;
        int maxCount = Integer.MIN_VALUE;
        char previousCharacter = ' ';//you cant assign " " here since " " is a String and ' ' is a char
        for (int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);
            if (currentCharacter == previousCharacter) {
     // if currentCharacter is same as previousCharacter, increase the count by one
                count++;
            } 
            else {
                // else, reset the count to one and assign currentCharacter to previousCharacter
                count = 1;
                previousCharacter = currentCharacter;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}