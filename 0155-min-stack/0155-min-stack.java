class MinStack {
    
    // Time Complexity:O(1)
    // Space Complexity:O(2N)-->O(N)
    private Stack<Integer> stack;
    private Stack<Integer> minValueFinder;
    // initializing states inside constructor
    public MinStack() { 
    stack=new Stack<>();
    minValueFinder=new Stack<>();
    }
       
    public void push(int val) {
        // finding minimum element and pushing it on the top of minValueFinder
        if(minValueFinder.isEmpty() || val<=minValueFinder.peek()){
            minValueFinder.push(val);
        }
        // pushing val to stack
        stack.push(val);
    }
    
    public void pop() {
        // checking if 
        //1.minValueFinder and stack elements are the same and equal
        //2.minValueFinder and stack has one elements
        //3.minValueFinder only stores the minimum element or bunch of equal elements if stack and minValueFinder has the same and equal .
        if(stack.peek().equals(minValueFinder.peek())){
            minValueFinder.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minValueFinder.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */