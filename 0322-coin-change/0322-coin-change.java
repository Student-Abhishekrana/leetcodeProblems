class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int amn = 1; amn < amount + 1; amn++) {
            for (int coin : coins) {
                if (amn - coin >= 0) {
                    dp[amn] = Math.min(dp[amn], 1 + dp[amn - coin]);
                }
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}