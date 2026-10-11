class Solution {
    public void nextPermutation(int[] nums) {
        int n =nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        //if next permutation doesn't found
        if(i<0){
            rever(nums,0,n-1);

        }else{
            int j =n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums, i, j);
            rever(nums, i+1,n-1);

        }
    }

    private void rever(int[] nums, int i, int j) {
        while (i <= j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}