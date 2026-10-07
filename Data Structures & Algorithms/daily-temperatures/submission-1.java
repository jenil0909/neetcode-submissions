class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         int len = temperatures.length;
        int result[] = new int[len];
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < len;i++){
            while (!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                int temp = st.pop();
                result[temp] = Math.abs(i - temp);
            }
            st.push(i);
        }

        return result;
    }
}
