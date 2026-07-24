/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {

        if (head == null) {
            return head;
        }

        Node curr = head;
        while (curr != null) {
            if (curr.child != null) {
                Node nextNode = curr.next;

                Node childTail = curr.child;

                while (childTail.next != null) {
                    childTail = childTail.next;
                }

                //connect next after child tail

                if (nextNode != null) {
                    childTail.next = nextNode;
                    nextNode.prev = childTail;
                }

                //connect head to child node head
                curr.next = curr.child;
                curr.next.prev = curr;
                curr.child = null;

            }
            curr =curr.next;
        }
        return head;

    }
}