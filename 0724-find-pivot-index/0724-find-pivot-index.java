class Solution {
    public int pivotIndex(int[] nums) {
        int n =nums.length;
        int total_sum =0;
        for(int num :nums){
            total_sum +=num;
        }

        int left_sum =0;
        for(int i=0;i<n; i++){
            if(left_sum==total_sum-left_sum-nums[i]){
                return i;
            }
            left_sum +=nums[i];
        }
        return -1;
    }
}