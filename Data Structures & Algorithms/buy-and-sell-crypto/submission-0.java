class Solution {
    public int maxProfit(int[] prices) {
        // ALWAYS do a null/empty check first to avoid NullPointerException
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = prices[0]; // Track the cheapest buy price seen so far
        int maxProfit = 0;        // Track the maximum profit possible

        for (int i = 1; i < prices.length; i++) {
            // Update the minimum price if we find a cheaper day to buy
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // If today is not cheaper, check how much profit we make by selling today
            else {
                int currentProfit = prices[i] - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }
}