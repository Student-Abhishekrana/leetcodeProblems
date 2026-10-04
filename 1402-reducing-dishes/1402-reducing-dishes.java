class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int result = 0;
        int preSum = 0;
        int n = satisfaction.length;

        for (int i = n - 1; i >= 0; i--) {
            preSum += satisfaction[i];
            if (preSum < 0) {
                break;
            }
            result += preSum;
        }
        return result;
    }
}