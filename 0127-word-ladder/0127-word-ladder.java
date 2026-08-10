class Solution {
    public static class Pair {
        int steps;
        String word;

        public Pair(int steps, String word) {
            this.steps = steps;
            this.word = word;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        HashSet<String> set = new HashSet<>(wordList);
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(1, beginWord));
        set.remove(beginWord);

        while (!q.isEmpty()) {
            Pair curr = q.remove();
            int currSteps = curr.steps;
            String currWord = curr.word;

            if (currWord.equals(endWord)) {
                return currSteps;
            }

            for (int i = 0; i < currWord.length(); i++) {
            char[] currwordArr = currWord.toCharArray();

                for (char ch = 'a'; ch <= 'z'; ch++) {
                    currwordArr[i] = ch;
                    String tempString = new String(currwordArr);

                    if (set.contains(tempString)) {

                        q.add(new Pair(currSteps + 1, tempString));
                        set.remove(tempString);
                    }
                }

            }

        }
        return 0;

    }
}