
class StockSpanner {
    // The stack will store an array of two integers: {price, span}
    private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        // Every day starts with a span of at least 1 (itself)
        int span = 1;
        
        // Pop elements from the stack while the stack is not empty 
        // and the top price is less than or equal to the current price
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        
        // Push the current price and its calculated span onto the stack
        stack.push(new int[]{price, span});
        
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */