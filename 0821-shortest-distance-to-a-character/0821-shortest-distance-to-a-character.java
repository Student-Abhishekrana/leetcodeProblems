class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i)==c) {
                index.add(i);
            }
        }

        int[] result = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            int minDistance = Integer.MAX_VALUE;
            for (int j : index) {
                minDistance = Math.min(minDistance, Math.abs(i - j));
            }
            result[k++] = minDistance;
        }
        return result;
    }
}