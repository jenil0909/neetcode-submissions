class MyQueue {

    Deque<Integer> stc ;

    public MyQueue() {
        stc =new ArrayDeque<>();
    }
    
    public void push(int x) {

        stc.addLast(x);
        
    }
    
    public int pop() {
       return stc.removeFirst();
    }
    
    public int peek() {
      return  stc.peekFirst();
    }
    
    public boolean empty() {
        return stc.isEmpty();
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