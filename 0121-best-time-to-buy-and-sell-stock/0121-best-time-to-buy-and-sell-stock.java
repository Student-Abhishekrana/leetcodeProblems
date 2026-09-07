class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = Integer.MIN_VALUE;
        int buy = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            buy =Math.min(buy,prices[i]);
            max_profit =Math.max(max_profit,prices[i]-buy);
        }
       
        return max_profit;
    }
}