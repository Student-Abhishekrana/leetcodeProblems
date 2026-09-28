class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int n = horizontalCuts.length;
        int m = verticalCuts.length;

        int vertical_gap = verticalCuts[0];

        for (int i = 1; i < m; i++) {

            int gap = verticalCuts[i] - verticalCuts[i - 1];
            if (vertical_gap < gap) {
                vertical_gap = gap;
            }

        }

        int horizontal_gap = horizontalCuts[0];

        for (int i = 1; i < n; i++) {

            int gap = horizontalCuts[i] - horizontalCuts[i - 1];
            if (horizontal_gap < gap) {
                horizontal_gap = gap;
            }

        }

        int largest_vertical = verticalCuts[m - 1];
        if (vertical_gap < (w - largest_vertical)) {
            vertical_gap = w - largest_vertical;
        }

        int largest_horizontal = horizontalCuts[n - 1];
        if (horizontal_gap < (h - largest_horizontal)) {
            horizontal_gap = h - largest_horizontal;
        }

        int mod = (int)1000000007;
        return (int) (((long) vertical_gap * horizontal_gap) % mod);
    }
}