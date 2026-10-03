class Solution {
    public int maximumCandies(int[] candies, long k) {
        long left = 1;
        long total = 0;
        for (int num : candies) {
            total += num;

        }
        long right = total / k;
        long ans = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;
          
            long child = 0;
            for (int num : candies) {
                child += num / mid;

            }
            if (child >= k) {
                ans = mid;

                left = mid+1;
            } else {
                right = mid - 1;
            }
        }
        return (int) ans;
    }
}