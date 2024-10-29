public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
            ListNode current = head;
            head.next = prev;
            prev = current;
            head = next;
        }
        return prev;
    }
}
