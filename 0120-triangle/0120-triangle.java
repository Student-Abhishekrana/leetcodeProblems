class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[triangle.size()][triangle.size()];

        for (int j = 0; j < dp[0].length; j++) {
            dp[n - 1][j] = triangle.get(n - 1).get(j);
        }

        int min = Integer.MAX_VALUE;

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int top = dp[i + 1][j];
                int diag = dp[i + 1][j + 1];

                dp[i][j] = triangle.get(i).get(j) + Math.min(top, diag);
            }
        }
        return dp[0][0];

    }
}