class Solution {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
       int m =cuts.length;
       int[][] dp =new int[m][m];

       for(int i=m-1; i>=0; i--){
        for(int j=i; j<m; j++){
            int min_cost =Integer.MAX_VALUE;
            int start =(i==0)?0:cuts[i-1];
            int end =(j==m-1)?n:cuts[j+1];
            for(int k=i; k<=j; k++){
                int fs =(i<k)?dp[i][k-1]:0;
                int ss =(j>k)?dp[k+1][j]:0;
                int self =end-start;
                min_cost=Math.min(min_cost,self+fs+ss);
            }
            dp[i][j] =min_cost;
        }
       } 
       return dp[0][m-1];
    }
}