class Solution {
    public void moveZeroes(int[] nums) {
        int n =nums.length;
        int check_last_zero=0;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                check_last_zero=i;
                break;
            }
        }

        for(int i=check_last_zero+1; i<n; i++){
           
            if(nums[i]!=0 && nums[check_last_zero]==0){
                int temp =nums[check_last_zero];
                nums[check_last_zero] =nums[i];
                nums[i] =temp;
                check_last_zero++;
            }
        }
    }
}