class Solution {

    private class Pair{
        int temp;
        int position;

        public Pair(int temp,int position){
            this.temp = temp;
            this.position = position;
        }

    }

    public int[] dailyTemperatures(int[] temp) {
        int len = temp.length;
        int result[] = new int[len];
        Deque<Pair> st = new ArrayDeque<>();

        for (int i = 0;i< len;i++){
            int curr = temp[i];

            while(!st.isEmpty() && curr > st.peek().temp){
                Pair past = st.pop();
                result[past.position] =Math.abs(past.position - i);
            }

            st.push(new Pair(temp[i],i));
        }
        return result;        
     
    }
}
