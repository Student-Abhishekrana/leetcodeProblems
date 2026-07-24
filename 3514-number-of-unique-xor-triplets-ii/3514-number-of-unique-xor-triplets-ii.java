class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
       
        boolean pair[] = new boolean[2048];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pair[nums[i] ^ nums[j]] = true;
            }
        }

        boolean result[] = new boolean[2048];

        for (int num : nums) {
            for (int i = 0; i < 2048; i++) {
                if (pair[i]) {
                    result[i ^ num] = true;
                }
            }
        }
        int counter = 0;
        for (boolean x : result) {
            if (x) {
                counter++;
            }
        }

        return counter;
    }
}