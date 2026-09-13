class Solution {
    int [][]dp;
    int []cuts;
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        dp=new int[cuts.length][cuts.length];
        this.cuts =cuts;

        return cost(0,cuts.length-1,0,n);
    }
    private int cost(int i, int j, int start, int end){
        if(i>j){
            return 0;//there won't be any cuts
        }

        if(dp[i][j]!=0){
            return dp[i][j]; //cost has already computed;
        }
        int min_cost=Integer.MAX_VALUE;
        for(int k=i; k<=j; k++){
            int fs =cost(i,k-1,start,cuts[k]);
            int ss =cost(k+1,j,cuts[k],end);
            int self =end-start;
            min_cost =Math.min(min_cost,fs+ss+self);
        }
        return dp[i][j] =min_cost;
    }
}