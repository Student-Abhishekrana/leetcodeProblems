class Solution {
    public int matrixSum(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int totalSum = 0;

        for (int[] num : nums) {
            Arrays.sort(num);
        }
        for (int j = m-1; j >=0; j--) {
            int temp_max = 0;

            for (int i = 0; i < n; i++) {

                if (temp_max < nums[i][j]) {
                    temp_max = nums[i][j];
                }
            }
            totalSum += temp_max;
        }
        return totalSum;
    }
}