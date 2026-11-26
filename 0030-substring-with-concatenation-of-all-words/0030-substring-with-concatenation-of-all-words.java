class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        int wordLength = words[0].length();
        List<Integer> ans = new ArrayList<>();

        HashMap<String, Integer> wordsFreq = new HashMap<>();

        for (String word : words) {
            wordsFreq.put(word, wordsFreq.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < wordLength; i++) {
            HashMap<String, Integer> currFreq = new HashMap<>();
            int count = 0;
            int left = i;

            for (int right = i; right + wordLength <= s.length(); right += wordLength) {

                String rightWord = s.substring(right, right + wordLength);
                if (wordsFreq.containsKey(rightWord)) {

                    currFreq.put(rightWord, currFreq.getOrDefault(rightWord, 0) + 1);
                    count++;

                    while (currFreq.get(rightWord) > wordsFreq.get(rightWord)) {

                        String leftWord = s.substring(left, left + wordLength);
                        currFreq.put(leftWord, currFreq.get(leftWord) - 1);
                        left += wordLength;
                        count--;
                    }

                    if (words.length == count) {
                        ans.add(left);

                    }
                } else {
                    currFreq.clear();
                    count = 0;
                    left = right + wordLength;

                }

            }
        }
        return ans;
    }
}