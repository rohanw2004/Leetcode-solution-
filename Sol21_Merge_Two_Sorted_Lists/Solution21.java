import java.util.*;

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyList = new ListNode(0);
        ListNode headNode = dummyList;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                dummyList.next = list1;
                list1 = list1.next;
            } else {
                dummyList.next = list2;
                list2 = list2.next;
            }

            dummyList = dummyList.next;
        }

        // adding last element //
        if (list1 == null) {
            dummyList.next = list2;
        } else {
            dummyList.next = list1;
        }

        return headNode.next;
    }

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
        Solution obj = new Solution();

        // Example 1
        ListNode list1 = new ListNode(1,
                new ListNode(2,
                new ListNode(4)));

        ListNode list2 = new ListNode(1,
                new ListNode(3,
                new ListNode(4)));

        ListNode result = obj.mergeTwoLists(list1, list2);

        System.out.println("Example 1:");
        System.out.print("Output: ");
        printList(result);

        // Example 2
        ListNode list3 = null;
        ListNode list4 = null;

        result = obj.mergeTwoLists(list3, list4);

        System.out.println("Example 2:");
        System.out.print("Output: ");
        printList(result);

        // Example 3
        ListNode list5 = null;
        ListNode list6 = new ListNode(0);

        result = obj.mergeTwoLists(list5, list6);

        System.out.println("Example 3:");
        System.out.print("Output: ");
        printList(result);
    }
}

/*
Output:

Example 1:
Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4

Example 2:
Output:

Example 3:
Output: 0
*/