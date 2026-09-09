class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo,-2);
        return solve(coins, amount, memo);

        

    }

    private int solve(int[] coins, int amount, int[] memo) {
        if(amount < 0)
        {
            return -1;
        }
        if(amount==0){
            return 0;
        }
        int min_count =Integer.MAX_VALUE;

        if(memo[amount]!= -2){
            return memo[amount];
        }

        for(int coin :coins)
        {
            int res =solve(coins,amount-coin,memo);

            if(res >=0 && res < min_count){
                min_count =1+res;
            }
        }
        memo[amount] = min_count==Integer.MAX_VALUE?-1:min_count;
        return memo[amount];
    }
}