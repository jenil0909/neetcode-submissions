class MinStack {

     private Deque<Integer> mainStack;
    private Deque<Integer> minStack;

    public MinStack() {
        mainStack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        mainStack.push(val);

        if(minStack.isEmpty()){
            minStack.push(val);
        }
        else{
            if(minStack.peek()>=val)
            minStack.push(val);
        }
    }
    
    public void pop() {

     if (!mainStack.isEmpty() || !minStack.isEmpty()){
          int temp = mainStack.pop();
       if (!minStack.isEmpty() && temp == minStack.peek())
       minStack.pop();
     }
        
    }
    
    public int top() {

        return mainStack.peek();
        
    }

    
    public int getMin() {
        if (mainStack.isEmpty()) return -1;
        if (minStack.isEmpty()) return mainStack.peek();
        
        return minStack.peek();
    }
}
