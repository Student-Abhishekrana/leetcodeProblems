class Solution {
    public int maxSum(int[][] grid) {
        int ans =Integer.MIN_VALUE;
    
    for(int i=0; i<=grid.length-3; i++){
        for(int j=0; j<=grid[0].length-3;j++){

            int top =grid[i][j]+grid[i][j+1]+grid[i][j+2];
            
            int center =grid[i+1][j+1];
            
            int bottom =grid[i+2][j]+ grid[i+2][j+1] + grid[i+2][j+2];
            
            int max =top+center+bottom;
            ans =Math.max(max,ans);
        }
    }
        return ans;

    }
}