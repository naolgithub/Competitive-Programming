class Solution {
    public boolean backspaceCompare(String s, String t) {
        /*
        Using stack
        Time Complexity: O(N)
        Space Complexity:O(N)
        */
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
        //checking if size of stackS and stackT are equal or not
        if (stackS.size() != stackT.size()) return false;
        //while removing the top characters checking whether the top characters of stackS and stackT are equal or not
        while (!stackS.isEmpty() && !stackT.isEmpty()) {
            if (stackS.pop() != stackT.pop()) {
                return false;
            }
        }
        // just finally return true
        return true;
    }
}