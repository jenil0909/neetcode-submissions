class Solution {
    public int maxProfit(int[] prices) {
        int maxResult = 0;
        int result = 0;
        
        for (int i =0;i< prices.length-1;i++){
            if (prices[i] >= prices[i+1]){
                continue;
            }

            if (prices[i] < prices[i+1]){
                result = prices[i +1] - prices[i];
                maxResult =maxResult+result;
                // i++;
            }
        }
        return maxResult;
    }
}