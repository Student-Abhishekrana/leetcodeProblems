class Solution {
    public static int[][] dp;
    private int solve(int[] nums, int index, int time){
        if(index==nums.length){
            return 0;
        }
        if(dp[index][time]!= -1){
            return dp[index][time];
        }
        int take =time*nums[index]+solve(nums,index+1, time+1);
        int not_take =solve(nums, index+1, time);
        return dp[index][time] =Math.max(take,not_take);
    }
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        dp =new int[satisfaction.length][501];
        for(int i=0; i<satisfaction.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(satisfaction,0,1);
    }
}