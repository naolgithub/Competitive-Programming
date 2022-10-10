class Solution {
    public String removeKdigits(String num, int k) {
      if(k==num.length()) return "0";
      Stack<Character> stack=new Stack();
        int counter=0;
        while(counter<num.length()){
            while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(counter)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(counter));
            counter++;
        }
        while(k>0){
            stack.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            char character=stack.pop();
            sb.append(character);
        }
        sb.reverse();
        //eg1.0001---->>1
        //eg2.0000---->>0
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}