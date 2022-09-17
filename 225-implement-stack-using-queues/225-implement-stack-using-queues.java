class MyStack {
  private Queue<Integer> q1;
  private Queue<Integer> q2;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        int n=q1.size();
        while(n>1){
            int e=q1.peek();
            q2.add(e);
            q1.remove();
            n--;
        }
        int x=q1.peek();
        q1.remove();
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.remove();
        }
        return x;
    }
    
    public int top() {
         int n=q1.size();
        while(n>1){
            int e=q1.peek();
            q2.add(e);
            q1.remove();
            n--;
        }
        int x=q1.peek();
        q1.remove();
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.remove();
        }
        q1.add(x);
        return x;
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