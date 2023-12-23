package java.src;

public class ReverseLinkedList {

    class ListNode {
        ListNode(ListNode next, int val) {
            this.next = next;
            this.val = val;
        }

        ListNode next;
        int val;
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            return reverseList(head, null);
        }

        public ListNode reverseList(ListNode head, ListNode prev) {
            if (head == null) return prev;
            ListNode next = head.next;
            head.next = prev;
            return reverseList(next, head);
        }
    }
}
