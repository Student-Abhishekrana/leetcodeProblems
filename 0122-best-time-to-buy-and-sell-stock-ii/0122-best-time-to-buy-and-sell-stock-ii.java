class Solution {
    public int maxProfit(int[] prices) {
        int prev = 0;
        int curr = 1;
        int profit = 0;
        int buy = prices[0];
        while (curr < prices.length) {
            if(curr==prices.length-1){
                profit += prices[curr] - buy;
                buy = prices[curr];
            }
            if (prices[curr] < prices[prev]) {
                profit += prices[prev] - buy;
                buy = prices[curr];
            }
            curr++;
            prev++;
        }
        return profit;
    }
}