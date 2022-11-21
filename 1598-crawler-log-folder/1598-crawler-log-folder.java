class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack=new Stack<>();
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../")){
                if(!stack.isEmpty())
                stack.pop();
            }
            else if(logs[i].equals("./")){
            
            }
            else{
                stack.push(logs[i]);
            }
        }
        int count=0;
        while(!stack.isEmpty()){
            count++;
            stack.pop();
        }
        return count;
    }
}
