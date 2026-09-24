class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int length = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int dummy_length = 1;
                int dummy_num = num + 1;
                while (set.contains(dummy_num)) {
                    dummy_num++;
                    dummy_length++;
                }
                length = Math.max(dummy_length, length);
            }
        }
        return length;
    }
}