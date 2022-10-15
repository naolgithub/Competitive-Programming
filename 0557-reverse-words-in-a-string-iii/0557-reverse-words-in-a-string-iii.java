class Solution {
    // Split the string into String array 'words'.
    // Then use a StringBuilder to reverse each words within the 'words' array.
    // Note: This approach uses more time and memory than the two pointers, due to the use of StringBuilder.

    public String reverseWords(String s) {
        // Split the String 's' using regex " ".
        String[] words = s.split(" ");
        // Reverse each word in the 'words' array.
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
      
        
        // Build a new String using the " " delimiter and return result.
        return String.join(" ", words);
    }
}