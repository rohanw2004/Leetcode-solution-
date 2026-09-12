# Definition for singly-linked list:
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution(object):
    def mergeTwoLists(self, list1, list2):
        head = ListNode()
        current = head

        while list1 and list2:
            if list1.val < list2.val:
                current.next = list1
                list1 = list1.next
            else:
                current.next = list2
                list2 = list2.next

            current = current.next

        current.next = list1 or list2

        return head.next


# Print linked list
def printList(head):
    result = []

    while head:
        result.append(str(head.val))
        head = head.next

    print(" -> ".join(result))


solution = Solution()

# Example 1
list1 = ListNode(1, ListNode(2, ListNode(4)))
list2 = ListNode(1, ListNode(3, ListNode(4)))

result = solution.mergeTwoLists(list1, list2)

print("Example 1:")
print("Output:", end=" ")
printList(result)


# Example 2
list1 = None
list2 = None

result = solution.mergeTwoLists(list1, list2)

print("Example 2:")
print("Output:", end=" ")
printList(result)


# Example 3
list1 = None
list2 = ListNode(0)

result = solution.mergeTwoLists(list1, list2)

print("Example 3:")
print("Output:", end=" ")
printList(result)


"""
Output:

Example 1:
Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4

Example 2:
Output:

Example 3:
Output: 0
"""