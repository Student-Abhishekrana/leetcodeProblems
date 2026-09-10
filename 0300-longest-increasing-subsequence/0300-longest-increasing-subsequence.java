class Solution {
    public int lengthOfLIS(int[] nums) {
        //increasing Order
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int[] arr = new int[set.size()];
        int i = 0;
        for (Integer num : set) {
            arr[i++] = num;
        }
        Arrays.sort(arr);

        return lcs(nums, arr);

    }

    private int lcs(int[] nums, int[] arr) {
        int n = nums.length;
        int m = arr.length;

        if (n > m) {
            return lcs(arr, nums);
        }

        int[] dp = new int[m + 1];
        for (int i = 1; i < n + 1; i++) {
            int diag = 0;
            for (int j = 1; j < m + 1; j++) {
                int temp = dp[j];
                if (nums[i - 1] == arr[j - 1]) {
                    dp[j] = temp + 1;
                } else {
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
                diag = temp;
            }
        }
        return dp[m];
    }
}