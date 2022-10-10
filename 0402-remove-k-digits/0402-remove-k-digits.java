class Solution {
    public String removeKdigits(String num, int k) {
     // if k is equal to num.length return zero since we delete 
     // all the character of the string
        if(k==num.length()) return "0";
        Stack<Character> stack=new Stack<>();
        int counter=0;
        
        while(counter<num.length()){
            //if the previous added character to stack is greater than the current character which is not added yet we pop the previous character out of the stack and add the current character to the stack 
            while(k>0 &&!stack.isEmpty() && stack.peek()>num.charAt(counter)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(counter));
            counter++;
        }
        
         // if our eg.num="1111", the first above loop add all characters of the string to the stack but not remove them because of all of the characters of the string is equal AND the below loop will remove the k number characters from the stack 
        while(k>0){
            stack.pop();
            k--;
        }
        
        // adding the left unremoved characters into sb
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            char currentCharacter=stack.pop();
            sb.append(currentCharacter);
        }
        // after adding the left unremoved characters into sb we         //have to reverse the sb string
        sb.reverse();
        //if sb string be '00134',we remove the leading zeros
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}