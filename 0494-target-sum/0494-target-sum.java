class Solution {
    //we have a two option here 
    //1> addition
    //2 >substraction


    public int findTargetSumWays(int[] nums, int target) {
    return helper(nums,target,0,0);    
    }
    private int helper(int nums[], int target, int index, int sum){
        if(index >= nums.length){
            return sum==target ? 1:0;
        }

        //addition
        int add =helper(nums,target,index+1, sum+nums[index]);
        int subs =helper(nums,target,index+1,sum-nums[index]);
        return add+subs;
    }

}