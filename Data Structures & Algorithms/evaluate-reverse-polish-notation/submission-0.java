class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        // Use .length for arrays
        if (tokens == null || tokens.length == 0) return 0; 
        
        // Correctly iterate as Strings
        for (String t : tokens) {
            // Check if the token is an operator
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                
                // Correct switch syntax with breaks
                switch (t) {
                    case "+":
                        stack.push(temp2 + temp1);
                        break;
                    case "-":
                        stack.push(temp2 - temp1);
                        break;
                    case "*":
                        stack.push(temp2 * temp1);
                        break;
                    case "/":
                        stack.push(temp2 / temp1);
                        break;
                }
            } else {
                // Only parse as an integer if it's NOT an operator
                stack.push(Integer.parseInt(t));
            }
        }
        
        return stack.peek();
    }
}