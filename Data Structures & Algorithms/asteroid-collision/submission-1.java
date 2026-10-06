class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Deque<Integer> stk = new ArrayDeque<>();

        for (int asteroid : asteroids) {

            // Keep resolving while collision is possible
            while (!stk.isEmpty() && stk.peek() > 0 && asteroid < 0) {

                int top = stk.peek();

                // Stack asteroid is smaller
                if (Math.abs(top) < Math.abs(asteroid)) {
                    stk.pop();
                    continue;
                }

                // Same size -> both explode
                if (Math.abs(top) == Math.abs(asteroid)) {
                    stk.pop();
                    asteroid = 0;
                    break;
                }

                // Stack asteroid is bigger
                else {
                    asteroid = 0;
                    break;
                }
            
            }

            // Current asteroid survived
            if (asteroid != 0) {
                stk.push(asteroid);
            }
        }

       
     int[] res = new int[stk.size()];
for (int i = res.length - 1; i >= 0; i--) {
    res[i] = stk.pop();
}
       return res;
    }
}