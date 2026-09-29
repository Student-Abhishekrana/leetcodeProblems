class Solution {
    private static void swap(int[] nums, int num1, int num2){
        int temp =nums[num1];
        nums[num1] =nums[num2];
        nums[num2] =temp;
    }
    public void sortColors(int[] nums) {
        // 3 pointer approach
        int high =nums.length-1;
        int low= 0;
        int mid =0;

        while(mid<=high){
           switch (nums[mid]) {
            case 0: swap(nums, low++, mid++);
            break;
            case 1: mid++;
            break;
            case 2: swap(nums, mid, high--);
           }
        }
        
    }
}