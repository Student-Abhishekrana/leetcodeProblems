class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        //tabulation // space O(min(n,m));
        //always consider text2.length() is shorter;
        if(text1.length()< text2.length()){
            return longestCommonSubsequence(text2,text1);
        }
        int n =text1.length();
        int m =text2.length();
       
        int[] dp= new int[m+1];
        
    
        for(int i=1; i<n+1;i++){
            int previous_diag =0;
            for(int j=1;j<m+1;j++){
                int temp =dp[j];
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                 dp[j] =1+previous_diag;
                }
                else{
                    int ans1 =dp[j];
                    int ans2 =dp[j-1];
                    dp[j] =Math.max(ans1,ans2);
                }
                previous_diag =temp;
            }
        }
        return dp[m];
    }
}