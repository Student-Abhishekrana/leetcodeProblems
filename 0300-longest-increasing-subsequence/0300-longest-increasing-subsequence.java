class Solution {
    public int lengthOfLIS(int[] nums) {

        //for remove duplicate items
        HashSet<Integer> set = new HashSet<>();
       for(int i=0; i<nums.length;i++){
        set.add(nums[i]);
       }
        int[] arr = new int[set.size()];

        int i = 0;
        for (int num : set) {
            arr[i] = num;
            i++;
        }
        Arrays.sort(arr);

        return lcs(nums, arr);

    }

    private int lcs(int[] nums, int[] arr) {
        if (nums.length < arr.length) {
            return lcs(arr, nums);
        }

        int n = nums.length;
        int m = arr.length;

        int[][] dp = new int[n+1][m + 1];
     
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {
          
                if (nums[i - 1] == arr[j - 1]) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                   int ans1 =dp[i-1][j];
                   int ans2 =dp[i][j-1];
                   dp[i][j] =Math.max(ans1,ans2);
                }

              
            }
        }
        return dp[n][m];
    }
}