class Solution {
    public int pivotIndex(int[] nums) {
        int n =nums.length;
        int index =0;
        while(index < n){
            int left_sum =0;
            for(int i=0; i<index; i++){
                left_sum +=nums[i];
            }

            int right_sum =0;
            for(int i=n-1;i>index; i--){
                right_sum +=nums[i];
            }
            if(left_sum == right_sum){
                return index;
            }
            index++;
        }
        return -1;
    }
}