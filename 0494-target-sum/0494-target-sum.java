class Solution {
    //we have a two option here 
    //1> addition
    //2 >substraction


    public int findTargetSumWays(int[] nums, int target) {
            int sum =0;
            for(int num :nums){
                sum +=num;
            }

            if(Math.abs(target)>sum || (sum+target)%2==1){
                return 0;
            }

            int subsetSum =(target+sum)/2;

            int dp[] =new int[subsetSum+1];
            dp[0]=1;

            for(int num :nums){
                for(int i=subsetSum; i>=num; i--){
                    dp[i] +=dp[i-num];
                }
            }
            return dp[subsetSum];


    
      }

}