class Solution {
    public boolean checkValidString(String s) {
        //first stack to store position of open bracket
        Stack<Integer> star  = new Stack<Integer>();
        //second stack to store position of star
        Stack<Integer> open = new Stack<Integer>();
        
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            
            //if left bracket then push it in stack
            if(ch =='(')
                open.push(i);
            
            else  if(ch == '*')
                star.push(i);
            
            else{
                //when right bracket comes, check for stack of left bracket
                if(!open.empty()) //if non empty remove it
                    open.pop();
                
                else if(!star.empty()) //if left is 0, then check if we can take star as left bracket
                    star.pop();
                else
                    return false;
            }
        }
        
        
        //left over left bracket balance needs to be checked
        while(!open.empty()) {
            if(star.empty())
                return false;
            
            //position comparison as left bracket should come before right bracket
            else if(open.peek()<star.peek()) {
                open.pop();
                star.pop();
            }
            
            else
                return false;
        }
        
        return true;
        
    }
}