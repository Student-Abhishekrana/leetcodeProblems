class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;

        int[][] dp = new int[n + 1][m + 1];
        dp[0][0] = 1;
        //check column 
        for(int i=1; i<n; i++)
        {
            dp[i][0] = (obstacleGrid[i][0]==0 && dp[i-1][0]==1)? 1 :0;
        }

        for(int j=1; j<m; j++){
            dp[0][j] = (obstacleGrid[0][j]==0 && dp[0][j-1]==1)? 1:0;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
               if(obstacleGrid[i][j]!=1){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
               }else{
                dp[i][j] =0;
               }
            }
        }
        return dp[n - 1][m - 1];
    }
}