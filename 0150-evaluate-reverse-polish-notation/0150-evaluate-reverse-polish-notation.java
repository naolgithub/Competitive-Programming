class Solution {
    public int evalRPN(String[] tokens) {
        //1.use string equals method,not ==
        //2.prefix notation is polish notation
        //3.postfix notation is reverse polish notation
        Stack<Integer> stack=new Stack<Integer>();
        for(String token : tokens){
            if(token.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(token.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else if(token.equals("-")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b-a);
            }
            else if(token.equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b/a);
            }
            else{
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}