class Solution {
    public int numberOfBeams(String[] bank) {
        int total_laser = 0;
        int prev_laser = 0;
        for (String bank_beam : bank) {
            int curr_laser = 0;
            for (int i = 0; i < bank_beam.length(); i++) {
                char ch = bank_beam.charAt(i);
                if (ch == '1') {
                    curr_laser++;
                }
            }
            if (curr_laser > 0) {

                total_laser += curr_laser * prev_laser;
                prev_laser = curr_laser;
            }
        }
        return total_laser;
    }
}