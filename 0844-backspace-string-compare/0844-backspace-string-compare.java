class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS=new Stack();
        Stack<Character> stackT=new Stack();
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)!='#') {
                stackS.push(s.charAt(i));
            }
            else{
                if(!stackS.isEmpty()) stackS.pop();
            }
        }
        
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#') {
                stackT.push(t.charAt(i));
            }
            else{
                if(!stackT.isEmpty()) stackT.pop();
            }
        }
        if (stackS.size() != stackT.size()) return false;
        while (!stackS.isEmpty() && !stackT.isEmpty()) {
            if (stackS.pop() != stackT.pop()) {
                return false;
            }
        }
        return true;
    }
}