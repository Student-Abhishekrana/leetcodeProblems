class Solution {
    public boolean predictTheWinner(int[] nums) {

        int dp[][] = new int[nums.length + 1][nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                dp[i][j] = -1;
            }
        }

        int diff = winner(dp, 0, nums.length - 1, nums);
        return diff >= 0;

    }

    private int winner(int[][] dp, int start, int end, int[] nums) {
        if (dp[start][end] != -1) {
            return dp[start][end];
        }

        if (start == end) {
            return nums[start];
        }

        int left = nums[start] - winner(dp, start + 1, end,nums);
        int right = nums[end] - winner(dp, start, end - 1,nums);
        dp[start][end] = Math.max(left, right);

        return dp[start][end];

    }
}