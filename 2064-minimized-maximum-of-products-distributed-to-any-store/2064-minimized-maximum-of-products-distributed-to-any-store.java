class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int left = 1;
        int right = 0;
        for (int quantity : quantities) {
            if (quantity > right) {
                right = quantity;
            }
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            int currCount = 0;
            for (int quantity : quantities) {
                currCount += (quantity+mid - 1) / mid;
            }
            if (currCount > n) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}