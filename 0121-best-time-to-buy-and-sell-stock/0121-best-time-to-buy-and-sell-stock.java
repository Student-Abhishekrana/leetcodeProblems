class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = Integer.MIN_VALUE;
        int buy = prices[0];
        for (int i = 0; i < prices.length; i++) {
            int max = 0;
            if (prices[i] < buy) {
                buy = prices[i];
            }
            max = prices[i] - buy;
            max_profit = Math.max(max_profit, max);

        }
        return max_profit;
    }
}