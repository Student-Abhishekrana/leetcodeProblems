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
        if(head==null || head.next==null || head.next.next==null){
            return new int[]{-1,-1};
        }
        ListNode prev = head;
        ListNode curr = head.next;

        int index = 2;
        int firstCritical =-1;
        int lastCritical =-1;
        int minDist =Integer.MAX_VALUE;


        while (curr != null && curr.next != null) {
            if ((curr.val > prev.val && curr.val > curr.next.val)|| (curr.val < prev.val && curr.val < curr.next.val) )
            {
                if(firstCritical ==-1){
                    firstCritical =index;
                }else{
                    minDist =Math.min(minDist,index-lastCritical);
                }
                lastCritical =index;

            }
               
            prev = prev.next;
            curr = curr.next;
            index++;
        }

        int[] ans =new int[2];
        ans[0] =minDist;
        ans[1] =lastCritical-firstCritical;

        if(firstCritical==-1 || firstCritical==lastCritical){
            return new int[]{-1,-1};
        }
       
         
        return ans;
    }
}