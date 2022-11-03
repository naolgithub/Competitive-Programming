class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
        // Loop for each character of the string
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') stack.pop();
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') stack.pop();
            // If none of the valid symbols is encountered
            //i.e if string contains invalid characters in it return false.eg.s="]",s="[}"
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}