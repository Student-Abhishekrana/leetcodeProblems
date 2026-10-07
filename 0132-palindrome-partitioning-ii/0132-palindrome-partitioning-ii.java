class Solution {
    public int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        boolean [][] ispal =new boolean[n+1][n+1];


        for (int i = n - 1; i >= 0; i--) {
            int mini = Integer.MAX_VALUE;
            for (int k = i; k < n; k++) {
                if (s.charAt(i)==s.charAt(k) && (k-i <= 2 || ispal[i+1][k-1])) {
                    ispal[i][k] =true;
                    int x = 1 + dp[k + 1];
                    mini = Math.min(mini, x);
                }
            }
            dp[i] = mini;
        }
        return dp[0] - 1;
    }

    
}