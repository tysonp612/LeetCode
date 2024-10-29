//source: https://leetcode.com/problems/reverse-linked-list/description/
//Input: head = [1,2,3,4,5]
//Output: [5,4,3,2,1]


//Input: head = [1,2]
//Output: [2,1]
//Example 3:
//
//Input: head = []
//Output: []

public class Main {
    public static void main(String[] args) {
        // Example 1: [1, 2, 3, 4, 5]
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        Solution solution = new Solution();
        ListNode reversedHead1 = solution.reverseList(head1);
        printList(reversedHead1);

        // Example 2: [1, 2]
        ListNode head2 = new ListNode(1, new ListNode(2));
        ListNode reversedHead2 = solution.reverseList(head2);
        printList(reversedHead2);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

    }
}