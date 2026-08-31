/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;

        int currIndex = 1;

        ArrayList<Integer> al = new ArrayList<>();

        while (curr != null && curr.next != null) {
            if (curr.val > prev.val && curr.val > curr.next.val) {
                al.add(currIndex);
            }
            if (curr.val < prev.val && curr.val < curr.next.val) {
                al.add(currIndex);
            }
            prev = prev.next;
            curr = curr.next;
            currIndex++;
        }

        int[] ans = new int[] { -1, -1 };
        if (al.size() >= 2) {
            int minDist = Integer.MAX_VALUE;

            for (int i = 1; i < al.size(); i++) {
                minDist =Math.min(minDist,al.get(i)-al.get(i-1));

            }
            int maxDist = al.get(al.size()-1)-al.get(0);
            ans[0] =minDist;
            ans[1] =maxDist;
        }
        return ans;
    }
}