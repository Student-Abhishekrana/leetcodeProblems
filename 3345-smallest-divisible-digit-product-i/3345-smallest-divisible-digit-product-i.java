class Solution {
    public int smallestNumber(int n, int t) {
        int ans = n;
        while (true) {
            int digitProduct = 1;
            int temp = ans;

            while (temp > 0) {
                digitProduct *= temp % 10;
                temp /= 10;

            }

            if (digitProduct % t == 0) {
                break;
            }
            ans++;

        }

        return ans;

    }
}