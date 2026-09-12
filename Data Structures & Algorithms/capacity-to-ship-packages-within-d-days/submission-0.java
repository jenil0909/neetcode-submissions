class Solution {
    public int shipWithinDays(int[] weight, int days) {
        int len = weight.length;
          int left = Arrays.stream(weight).max().getAsInt();
          int day;
        // Find total sum as maximum capacity
        int right = Arrays.stream(weight).sum();
        for (int i = left ; i<=right;i++){
            int currSum = 0;day = 1;
            
            for (int j= 0;j<len;j++){
                if (currSum + weight[j]>i){
                    day++;
                    currSum = weight[j];
                }
                else {
                // Otherwise, add weight to current load
                currSum += weight[j];
            }
            }
            if (day<=days){ return i;}

        }
        return -1;
    }
}