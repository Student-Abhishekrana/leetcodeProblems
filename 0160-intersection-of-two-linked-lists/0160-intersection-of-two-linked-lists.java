/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode pointA = headA;
        ListNode pointB = headB;

        while (pointA != pointB) {
            pointA = pointA.next;
            pointB = pointB.next;

            if (pointA == null && pointB == null) {
                return null;
            }

            if (pointA == null && pointB != null) {
                pointA = headB;
            }
            if (pointB == null && pointA != null) {
                pointB = headA;
            }
        }
        return pointA;
    }
}