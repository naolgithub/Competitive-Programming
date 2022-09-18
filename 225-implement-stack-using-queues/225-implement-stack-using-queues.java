class MyStack {
    //TC of top():O(1)
    //TC of empty():O(1)
    //TC of pop():O(1)
    //TC of push():O(N)
    //SC of the two queues:O(N)
  private Queue<Integer> q1;
  private Queue<Integer> q2;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }   
    public void push(int x) {
        q2.add(x);
        //push all the remaining elements in q1 to q2
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        //swap the names of two queues
        //avoid copying all elements from q2 to q1.
        Queue<Integer> q=q1;
        q1=q2;
        q2=q;
    }
    
    public int pop() {
        if(q1.isEmpty()){
            return 0;
        }
        int x=q1.peek();
        q1.remove();
        return x;
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */