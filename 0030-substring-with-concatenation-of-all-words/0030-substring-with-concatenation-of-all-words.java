class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        if (s.isEmpty() || words.length <= 0) {
            return result;
        }
        int length = s.length();
        int wordLength = words[0].length();

        HashMap<String, Integer> wordFreq = new HashMap<>();

        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < wordLength; i++) {
            int left = i;
            int count = 0;
            HashMap<String, Integer> currFreq = new HashMap<>();

            for (int right = i; right + wordLength <= length; right += wordLength) {

                String rightWord = s.substring(right, right + wordLength);

                if (wordFreq.containsKey(rightWord)) {
                    currFreq.put(rightWord, currFreq.getOrDefault(rightWord, 0) + 1);
                    count++;

                    while (currFreq.get(rightWord) > wordFreq.get(rightWord)) {
                        String leftWord = s.substring(left, left + wordLength);
                        currFreq.put(leftWord, currFreq.get(leftWord) - 1);
                        left += wordLength;
                        count--;
                    }

                    if (count == words.length) {
                        result.add(left);
                    }
                } else {
                    currFreq.clear();
                    count = 0;
                    left = right + wordLength;
                }

            }
        }
        return result;
    }
}