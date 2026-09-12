class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right  =Arrays.stream(weights).sum();
        int result = right;
        while (left <= right){
            int leastCapacity = left+(right-left)/2;
            boolean daysNeeded = NeededDays(leastCapacity,days, weights);
            if (daysNeeded){
                result = leastCapacity;
                right=leastCapacity-1;

            }
            else left = leastCapacity+1;

        }
        return result;
    }

    public boolean NeededDays(int leastCapacity, int days, int[] weights){
        
        int currentDays = 1;
        int currentLoad = 0;

        for (int w : weights){
            if (w+currentLoad >leastCapacity){
                currentLoad = w;
                currentDays++;
            }
            else currentLoad+=w;
        }

        return currentDays<=days;
    }
}