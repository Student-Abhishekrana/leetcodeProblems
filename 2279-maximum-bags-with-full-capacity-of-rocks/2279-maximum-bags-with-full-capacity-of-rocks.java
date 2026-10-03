class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for (int i = 0; i < rocks.length; i++) {
            rocks[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(rocks);
        int count = 0;

        for (int num : rocks) {
            if (num == 0 || additionalRocks >= num) {
                count++;
                additionalRocks -= num;
            }
        }

        return count;
    }
}