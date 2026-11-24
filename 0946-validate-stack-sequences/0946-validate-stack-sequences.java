class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();

        int popPointer = 0;
        int pushPointer = 0;
        int n = pushed.length;

        while (pushPointer < n) {
            while (!st.isEmpty() && st.peek() == popped[popPointer]) {
                st.pop();
                popPointer++;
            }
            st.push(pushed[pushPointer]);
            pushPointer++;

        }
        while (!st.isEmpty() && st.peek() == popped[popPointer]) {
            st.pop();
            popPointer++;
        }

        return st.isEmpty() ? true : false;
    }
}