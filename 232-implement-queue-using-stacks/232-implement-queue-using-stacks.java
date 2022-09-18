class MyQueue {
   Stack<Integer> s1;
   Stack<Integer> s2;
    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    public int pop() {
         int n=s1.size();
        while(n>1){
            int s=s1.peek();
            s2.add(s);
            s1.pop();
            n--;
        }
        int x=s1.peek();
        s1.pop();
        while(!s2.isEmpty()){
            s1.push(s2.peek());
            s2.pop();
        }
        return x;
    }
    
    public int peek() {
          int n=s1.size();
        while(n>1){
            int s=s1.peek();
            s2.add(s);
            s1.pop();
            n--;
        }
        int x=s1.peek();
        while(!s2.isEmpty()){
            s1.push(s2.peek());
            s2.pop();
        }
        return x;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */