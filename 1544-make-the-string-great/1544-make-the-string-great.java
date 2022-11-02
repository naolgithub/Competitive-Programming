class Solution {
    public String makeGood(String s) {
        /*
        The ASCII value of the lowercase alphabet is from 97 to 122. And, the ASCII value of the uppercase alphabet is from 65 to 90.
        
A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1]
        */
        // Use stack to store the visited characters.
        Stack<Character> stack = new Stack<>();  
        // Iterate over 's'.
        for (char currentCharacter : s.toCharArray()) {
            // If the current character make a pair with the last character in the stack,
            // remove both of them. Otherwise, we the add current character to stack.
            if (!stack.isEmpty() && Math.abs(stack.lastElement() - currentCharacter) == 32) 
                stack.pop();
            else
                stack.add(currentCharacter);
        }
        // Returns the string concatenated by all characters left in the stack.
        StringBuilder result = new StringBuilder();
        for (char character : stack) 
            result.append(character);
        return result.toString();
    }
}