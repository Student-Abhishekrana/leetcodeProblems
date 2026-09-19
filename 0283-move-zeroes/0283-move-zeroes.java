class Solution {
    public void moveZeroes(int[] nums) {

        int zero = 0, non_zero = 0;

        while (non_zero < nums.length) {
            if (nums[non_zero] == 0) {
                non_zero++;
            } else {
                int temp = nums[zero];
                nums[zero] = nums[non_zero];
                nums[non_zero] = temp;
                zero++;
                non_zero++;
            }
        }
    }
}
