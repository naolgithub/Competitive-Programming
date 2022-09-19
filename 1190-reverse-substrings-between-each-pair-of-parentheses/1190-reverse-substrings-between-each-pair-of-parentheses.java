class Solution {
    public String reverseParentheses(String s) {
        // solving using stack and queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new ArrayDeque<>();
           //OR
        //Queue<Character> queue = new LinkedList<>();
        
        String result ="";
        
        for(int i= 0 ;i < s.length() ;i++){
            char character = s.charAt(i);
            if(character == ')'){
                
                while(stack.peek() != '('){
                    queue.add(stack.pop());
                }
                stack.pop();
                
                while(queue.size() > 0){
                    stack.push(queue.remove());
                    //OR
                    //stack.push(queue.poll());
                }
            }
            else{
                stack.push(character);
            }
            
        }
        while(stack.size() > 0){
            result = stack.pop() + result;
        }
        return result;
    }
}