class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int n = horizontalCuts.length;
        int m = verticalCuts.length;

        int vertical_gap = verticalCuts[0];

        for (int i = 1; i < m; i++) {

            int gap = Math.abs(verticalCuts[i] - verticalCuts[i - 1]);
            vertical_gap = Math.max(gap, vertical_gap);

        }

        int horizontal_gap = horizontalCuts[0];

        for (int i = 1; i < n; i++) {

            int gap = Math.abs(horizontalCuts[i] - horizontalCuts[i - 1]);
            horizontal_gap = Math.max(gap, horizontal_gap);

        }

        int largest_vertical = verticalCuts[m - 1];
        if (vertical_gap < (w - largest_vertical)) {
            vertical_gap = w - largest_vertical;
        }
        int largest_horizontal = horizontalCuts[n - 1];
        if (horizontal_gap < (h - largest_horizontal)) {
            horizontal_gap = h - largest_horizontal;
        }

        int mod = (int) Math.pow(10, 9) + 7;
        return (int) (((long) vertical_gap * horizontal_gap) % mod);
    }
}