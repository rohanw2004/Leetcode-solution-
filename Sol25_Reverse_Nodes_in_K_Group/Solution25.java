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

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverse(ListNode start, ListNode end) {
        ListNode prev = null, curr = start;
        while (curr != end) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        if (count < k) return head;

        ListNode newHead = reverse(head, temp);
        head.next = reverseKGroup(temp, k);
        return newHead;
    }
}

public class Main {

    // Print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Example 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        int k1 = 2;

        ListNode result1 = solution.reverseKGroup(head1, k1);

        System.out.println("Example 1:");
        System.out.println("Input: 1 -> 2 -> 3 -> 4 -> 5");
        System.out.println("k = 2");
        System.out.print("Output: ");
        printList(result1);


        // Example 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);

        int k2 = 3;

        ListNode result2 = solution.reverseKGroup(head2, k2);

        System.out.println("\nExample 2:");
        System.out.println("Input: 1 -> 2 -> 3 -> 4 -> 5");
        System.out.println("k = 3");
        System.out.print("Output: ");
        printList(result2);
    }
}