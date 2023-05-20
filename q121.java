class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, profit = 0;

        for (int i = 0; i <= prices.length - 1; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            if (profit < prices[i] - minPrice) {
                profit = prices[i] - minPrice;
            }
        }

        return profit;
    }
}
