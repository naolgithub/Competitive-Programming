class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character> stack = new Stack();

        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                stack.push(ch);
            } else {
                // if top of stack is '('
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    stack.push('1');
                } else {
                    // if top of stack is a '(char) number'
                    int sum = 0;
                    while(!stack.isEmpty() && stack.peek()!='(') {
                        sum += stack.pop()-'0';
                    }
                    // pop '('
                    stack.pop();
                    stack.push((char)(2*sum+'0'));
                }
            }
        }
        
        int sum = 0;
        while(!stack.isEmpty()) {
            sum += (stack.pop()-'0');
        }
        return sum;
    }
}