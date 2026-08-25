class Solution {
   
      
    public int minDistance(String word1, String word2) {
          //consider length of word2 is shorter
        if (word1.length() < word2.length()) {
            return minDistance(word2, word1);
        }
int n=word1.length();
int m =word2.length();
        int[] dp = new int[m + 1];

        for (int i = 1; i < n + 1; i++) {
            int previous = 0;
            for (int j = 1; j < m + 1; j++) {
                int temp = dp[j];
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[j] = 1 + previous;
                } else {
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
                previous = temp;
            }
        }
        return n+m-2*dp[m];
    }

    
}