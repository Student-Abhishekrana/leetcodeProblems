class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

        }
        int pairs = 0;

        for (Integer x : map.keySet()) {
            if (k == 0 && map.get(x) > 1 || k != 0 && map.containsKey(x + k)) {
                pairs++;
            }
        }
        return pairs;
    }
}