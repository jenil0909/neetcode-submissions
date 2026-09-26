class Solution {
     private Map<Character, Character> parenthesis = Map.of(
    ')', '(',
    ']', '[',
    '}', '{',
    '>','<'
);
    public boolean isValid(String s) {
        if (s.length() == 0) return false;
       Deque<Character> stack = new ArrayDeque<>();

        for (Character c : s.toCharArray()){

            if(c == '{' || c== '[' || c == '<' || c == '(')
            {
                stack.push(c);
            }
            else{
                if (stack.isEmpty()) return false;

                if (parenthesis.get(c) != stack.pop()) return false;

            }
        }

        return stack.isEmpty();
    }
}
