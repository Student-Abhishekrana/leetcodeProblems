class Solution {
    public int reverseDegree(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int reversedIndex = ('z'- ch+1);
            int presentIndex = i + 1;

            total += (reversedIndex * presentIndex);
        }
        return total;
    }
}