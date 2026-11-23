class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int openCount = 0;
        int closeCount = 0;
        String str = "";
        helper(ans, n, openCount, closeCount, str);

        return ans;
    }

    private void helper(List<String> ans, int n, int openCount, int closeCount, String str) {
        if (openCount == n && closeCount == n) {
            ans.add(str);
        } else {
            //subproblem
            if (openCount >closeCount) {

                helper(ans, n, openCount, closeCount + 1, str + ")");
            } if(openCount<n) {
                helper(ans, n, openCount + 1, closeCount, str + "(");
            }
        }
    }
}