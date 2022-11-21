class Solution {
    public int calPoints(String[] operations) {
     Stack<Integer> stack=new Stack<Integer>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")) stack.pop();
            else if(operations[i].equals("D")){
                int topOfStack=stack.peek();
                stack.push(topOfStack*2);
            }
            else if(operations[i].equals("+")){
                int firstRemovedOperation=stack.pop();
                int secondRemovedOperation=stack.pop();
                stack.push(secondRemovedOperation);
                stack.push(firstRemovedOperation);
                stack.push(firstRemovedOperation+secondRemovedOperation);
            } 
            else{
                stack.push(Integer.valueOf(operations[i]));
            }
        }
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}
