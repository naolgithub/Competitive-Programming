class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        int start=0;
        int end=0;
        StringBuilder sb= new StringBuilder();
        for(char i:s.toCharArray()){
            if(i=='('){
                stack.push('(');
                end++;
            }
            else if(i==')'){
                stack.pop();
                end++;
                /*
     example:   Input: s = "(()())(())"
                Output: "()()()"
                */
                if(stack.isEmpty()){
                    sb.append(s.substring(start+1, end-1));
                    start=end;
                }
            }
        }
        return sb.toString();   
    }
}