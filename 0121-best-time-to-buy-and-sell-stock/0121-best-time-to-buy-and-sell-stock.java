class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit =Integer.MIN_VALUE;
        int buyingPrice =prices[0];
        for(int i=0; i<prices.length; i++){
                int profit =0;

            if(prices[i]< buyingPrice){
                buyingPrice =prices[i];
               
            }
                profit =prices[i]-buyingPrice;
                maxProfit =Math.max(maxProfit,profit);
            
        }
        return maxProfit;
    }
}